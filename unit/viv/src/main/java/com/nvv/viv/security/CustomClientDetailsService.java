package com.nvv.viv.security;

import com.nvv.viv.entity.Client;
import com.nvv.viv.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomClientDetailsService implements UserDetailsService {
    private final ClientRepository clientRepository;

    @Autowired
    public CustomClientDetailsService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientRepository.findClientByEmail(username)
                .orElseThrow(()->new UsernameNotFoundException("Username not found with args: " + username));
        return build(client);
    }

    public static Client build(Client client) {
        List<GrantedAuthority> authorities = client.getRole().stream()
                .map(role->new SimpleGrantedAuthority(role.name()))
                .collect(Collectors.toList());
        return new Client(
                client.getId(), client.getUsername(), client.getEmail(), client.getPassword(), authorities);

    }


    public Client loadUserById(Long userId) {
        Client client = clientRepository.findClientById(userId)
                .orElseThrow(()->new UsernameNotFoundException("Username not found with args: " + userId));
        return build(client);
    }
}
