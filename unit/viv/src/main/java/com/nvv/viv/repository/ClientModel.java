package com.nvv.viv.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "clients")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    final LocalDateTime createdDate = LocalDateTime.now();

    @Column(unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String password;

    @ManyToOne
    @JoinColumn(name = "client_profile_model_id")
    ClientProfileModel clientProfileModel;

    @ManyToOne
    @JoinColumn(name = "role_model_id")
    RoleModel roleModel;

}
