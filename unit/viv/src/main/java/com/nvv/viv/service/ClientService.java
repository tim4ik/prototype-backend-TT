package com.nvv.viv.service;

import com.nvv.viv.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Optional<List<Client>> findAll();
    Optional<Client> findClientById(Long clientId);
}
