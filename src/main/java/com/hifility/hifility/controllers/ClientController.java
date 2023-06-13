package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.Client;
import com.hifility.hifility.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClientController  {
    @Autowired
    private IClientService service;
    @GetMapping("/api/clients")
    public List<Client> getAll (){
       return service.getAll();
    }

    @GetMapping("/api/clients/email/{email}")
    public Optional<Client> getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
    @GetMapping("/api/clients/{id}")
    public Client getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    @PostMapping("/api/auth/register")
    public void register(@RequestBody Client client) throws Exception {
        if(client.getEmail().isEmpty()){
            throw new Exception("Email debe estar lleno");
        }else if(!client.getEmail().matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            throw new Exception("Ingrese un Email válido");
        }
        client.setPassword(new BCryptPasswordEncoder().encode(client.getPassword()));
        service.register(client);
    }


    @DeleteMapping("/api/clients/{id}")
    public void delete(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

}
