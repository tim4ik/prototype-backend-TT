package com.nvv.viv.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "hashtags")
public class HashTagModel {
    @Id
    long Id;

    @Column(unique = true)
    String value;
}
