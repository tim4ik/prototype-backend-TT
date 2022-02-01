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
    @SequenceGenerator(name = "like_profile_sequence", sequenceName = "like_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "like_profile_sequence")
    @Column(name = "id", updatable = false)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private Client client;

}
