package com.nvv.viv.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public
class Role {
    @Id
    @SequenceGenerator(name = "role_profile_sequence", sequenceName = "role_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "value", unique = true, updatable = false , columnDefinition = "TEXT")
    private String name;

}
