package com.hifility.hifility.services;

import com.hifility.hifility.entities.Client;
import com.hifility.hifility.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService{
    @Autowired
    private ClientRepository repository;
    @Override
    public List<Client> getAll() {
        return (List<Client>) repository.findAll();
    }
    @Override
    public Client getById(Long id) {
        return (Client) repository.findById(id).get();
    }

    @Override
    public void register(Client client) {
        repository.save(client);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean login(Client client) throws Exception {
        if(repository.findByEmail(client.getEmail()) != null) {
            Optional<Client> auth = Optional.ofNullable(repository.findByEmail(client.getEmail()));
            if (auth.get().getPassword().equals(client.getPassword())){
                return true;
            } else {
                throw new Exception("There was an error on login");
            }
        }
        return true;
    }

}
