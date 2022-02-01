package com.nvv.viv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@NoArgsConstructor
public class Profile {
    @Id
    @SequenceGenerator(name = "profile_profile_sequence", sequenceName = "profile_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "username", nullable = false, columnDefinition = "TEXT")
    private String username;

    @Column(name = "phone", nullable = false, columnDefinition = "TEXT")
    private String phone;

    @Column(name = "bio", nullable = false, columnDefinition = "TEXT")
    private String bio;

    @Column(name="z_cr_date", nullable = false)
    LocalDateTime registrationDate = LocalDateTime.now();

    @Column(name="z_lock", nullable = false)
    private boolean lock = false;

    @Column(name="burn_date", nullable = false)
    private LocalDateTime birthday;

    @Lob
    @Column(name = "avatar")
    private byte[] avatar;

}
