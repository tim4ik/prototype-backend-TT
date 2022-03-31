package com.nvv.viv.service;

import com.nvv.viv.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Optional findAll() {
        return Optional.of(clientRepository.findAll());
    }

    @Override
    public Optional findClientById(Long clientId) {
        return Optional.of(clientRepository.getById(clientId));
    }
}
