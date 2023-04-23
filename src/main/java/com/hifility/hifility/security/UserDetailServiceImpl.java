package com.hifility.hifility.security;

import com.hifility.hifility.entities.Client;
import com.hifility.hifility.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Client client = clientRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("El usuario con email: "+ email+" no existe"));
        return new UserDetailsImpl(client);

    }
}
