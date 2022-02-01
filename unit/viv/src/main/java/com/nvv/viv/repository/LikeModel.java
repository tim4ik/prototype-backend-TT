package com.nvv.viv.repository;

import com.nvv.viv.repository.ClientModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "likes")
public class LikeModel {
    @Id
    long Id;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    ClientModel clientModel;

    public ClientModel getClientModel() {
        return clientModel;
    }
}
