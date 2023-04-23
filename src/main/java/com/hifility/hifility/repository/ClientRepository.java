package com.hifility.hifility.repository;

import com.hifility.hifility.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.email = ?1")
    Client findByEmail(String email);
}
