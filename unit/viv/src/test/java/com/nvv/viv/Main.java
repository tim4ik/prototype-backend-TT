package com.nvv.viv;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner mappingDemo(/*RoleRepository roleRepository*/) {
        return args -> {
//            roleRepository.create(new Role(0, "admin"));
//            roleRepository.create(new Role(0, "admin1"));
//            roleRepository.create(new Role(0, "admin2"));
//            roleRepository.create(new Role(0, "admin3"));
//            List<Role> roleList = roleRepository.read();
//            roleList.forEach(System.out::println);
        };
    }
}
