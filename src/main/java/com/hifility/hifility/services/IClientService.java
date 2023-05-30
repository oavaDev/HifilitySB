package com.hifility.hifility.services;

import com.hifility.hifility.entities.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    List<Client> getAll();
    Client getById(Long id);
    Optional<Client> getByEmail(String email);
    void register(Client client);

    void remove(Long id);

}
