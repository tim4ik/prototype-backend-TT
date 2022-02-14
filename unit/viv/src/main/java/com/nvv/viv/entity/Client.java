package com.nvv.viv.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name ="client_date" ,nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "login",unique = true, nullable = false, columnDefinition = "TEXT")
    @JsonIgnore
    private String email;

    @Column(name = "password" ,nullable = false, columnDefinition = "TEXT")
    @JsonIgnore
    private String password;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "profile_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "client_profile_fk"))
    private Profile profile;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "role_id")
    private Role role;

}
