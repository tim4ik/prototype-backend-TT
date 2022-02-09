package com.nvv.viv.entity.user;

import com.nvv.viv.abstracts.EntityDataBase;


import javax.persistence.*;
import java.util.Collection;


@Entity(name = "clients")
public class ClientModel extends EntityDataBase {
    public ClientModel() {
    }

    public ClientModel(long id) {
        super(id);
    }

    public ClientModel(String email, String password, ClientProfileModel clientProfileModel, Collection<RoleModel> roles) {
        this.email = email;
        this.password = password;
        this.clientProfileModel = clientProfileModel;
        this.roles = roles;
    }

    public ClientModel(long id, String email, String password, ClientProfileModel clientProfileModel, Collection<RoleModel> roles) {
        super(id);
        this.email = email;
        this.password = password;
        this.clientProfileModel = clientProfileModel;
        this.roles = roles;
    }

    @Column(nullable = false, updatable = false, unique = true)
    private String email;
    @Column(length = 3000)
    private String password;


    @ManyToOne
    @JoinColumn(name = "client_profile_model_id")
    private ClientProfileModel clientProfileModel;

    @ManyToMany
    @JoinTable(name = "app_rules", joinColumns = @JoinColumn(name = "client_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "app_role_id", referencedColumnName = "id"))
    private Collection<RoleModel> roles;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public ClientProfileModel getClientProfileModel() {
        return clientProfileModel;
    }

    public Collection<RoleModel> getRoles() {
        return roles;
    }
}
