package com.hifility.hifility.services;

import com.hifility.hifility.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAll();
    Client getById(Long id);

    void save(Client client);

    void remove(Long id);
}
