package com.nvv.viv.entity;

import com.nvv.viv.abstracts.EntityDataBase;


import javax.persistence.*;


@Entity(name = "clients")
public class ClientModel extends EntityDataBase {
    public ClientModel() {
    }

    public ClientModel(long id, String email, String password, ClientProfileModel clientProfileModel) {
        super(id);
        this.email = email;
        this.password = password;
        this.clientProfileModel = clientProfileModel;
    }

    @Column(nullable = false, updatable = false, unique = true)
    private String email;
    @Column(length = 3000)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_profile_model_id")
    private ClientProfileModel clientProfileModel;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public ClientProfileModel getClientProfileModel() {
        return clientProfileModel;
    }
}
