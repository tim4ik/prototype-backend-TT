package com.nvv.viv;


import com.nvv.viv.entity.user.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(ClientModelRepository clientModelRepository,
                                         RoleModelRepository roleModelRepository, ClientProfileModelRepository clientProfileModelRepository) {
        return args -> {
            boolean createRole = false;
            boolean createUser = false;
            try {
                if (createRole) {
                    roleModelRepository.save(new RoleModel("client"));
                    roleModelRepository.save(new RoleModel("moderator"));
                    roleModelRepository.save(new RoleModel("admin"));
                    List<RoleModel> roleModels = roleModelRepository.findAll();
                    roleModels.forEach(System.out::println);
                }
                if(createUser){
                    ClientProfileModel cpm = new ClientProfileModel("firstName","lastName","username","phoneNumber","bio", 741852963L, 123456789L, "avatar".getBytes(StandardCharsets.UTF_8));
                    clientProfileModelRepository.save(cpm);
                    var r = roleModelRepository.getById(1L);
                    var p = clientProfileModelRepository.getById(1L);
                    clientModelRepository.save(new ClientModel("w@w.w","123456789", p,r));
                }

            } catch (Exception e) {
                System.out.println(e);
            }


        };
    }
}
