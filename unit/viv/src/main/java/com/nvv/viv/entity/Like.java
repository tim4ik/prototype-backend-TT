package com.nvv.viv.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "likes")
@Getter
@Setter
@NoArgsConstructor
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long Id;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private Client client;

}
