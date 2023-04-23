package com.hifility.hifility.controllers;

import com.hifility.hifility.entities.Client;
import com.hifility.hifility.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;
import java.util.List;



@RestController
public class ClientController {
    @Autowired
    private IClientService service;
    @GetMapping("/api/clients")
    public List<Client> getAll (){
       return service.getAll();
    }
    @GetMapping("/api/clients/{id}")
    public Client getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @PostMapping("/api/clients")
    public void save(@Valid @RequestBody Client client) throws Exception {
        service.save(client);
    }

    @DeleteMapping("/api/clients/{id}")
    public void delete(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }

}
