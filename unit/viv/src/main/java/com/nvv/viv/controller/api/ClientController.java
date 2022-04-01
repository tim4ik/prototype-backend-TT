package com.nvv.viv.controller.api;

import com.nvv.viv.entity.Client;
import com.nvv.viv.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

//    @PostMapping("/save")
//    public ResponseEntity<Client> save(@RequestBody Client client){
//        return ResponseEntity.ok().body(clientService.findAll());
//    }

}
