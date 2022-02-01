package com.nvv.viv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @SequenceGenerator(name = "client_profile_sequence", sequenceName = "client_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name ="x_ldt_cd" ,nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "login",unique = true, nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name = "password" ,nullable = false, columnDefinition = "TEXT")
    private String password;

    @ManyToOne
    @JoinColumn(name = "client_profile_model_id")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "role_model_id")
    private Role role;

}
