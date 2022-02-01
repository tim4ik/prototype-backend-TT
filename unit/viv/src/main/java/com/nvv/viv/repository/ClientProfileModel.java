package com.nvv.viv.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "profiles")
public class ClientProfileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String phoneNumber;

    @Column
    String bio;

    @Column
    LocalDateTime dateTime = LocalDateTime.now();

    @Column(nullable = false)
    boolean active = true;

    @Column(nullable = false)
    long birthday;

    @Lob
    byte[] avatar;

}
