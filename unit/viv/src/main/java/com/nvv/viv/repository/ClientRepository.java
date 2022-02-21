package com.nvv.viv.repository;

import com.nvv.viv.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findClientByEmail(String username);

    Optional<Client> findClientById(Long userId);
}
