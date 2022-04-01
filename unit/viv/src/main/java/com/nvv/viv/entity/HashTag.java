package com.nvv.viv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hashtags")
@Getter
@Setter
@NoArgsConstructor
public class HashTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long Id;

    @Column(name = "tag",unique = true, columnDefinition = "TEXT")
    private String value;
}
