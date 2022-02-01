package com.nvv.viv.repository;
import javax.persistence.*;

@Entity(name = "rules")
public class RoleModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "value", unique = true, updatable = false)
    String name;

}
