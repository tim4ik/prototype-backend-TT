package com.nvv.viv.entity.user;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "clients")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    private final LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "mark")
    private boolean markForDelete = false;

    public ClientModel() {
    }

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "client_profile_model_id")
    private ClientProfileModel clientProfileModel;

    public ClientProfileModel getClientProfileModel() {
        return clientProfileModel;
    }

    @ManyToOne
    @JoinColumn(name = "role_model_id")
    private RoleModel roleModel;

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public ClientModel(String email, String password, ClientProfileModel clientProfileModel, RoleModel roleModel) {
        this.email = email;
        this.password = password;
        this.clientProfileModel = clientProfileModel;
        this.roleModel = roleModel;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public boolean isMarkForDelete() {
        return markForDelete;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setMarkForDelete(boolean markForDelete) {
        this.markForDelete = markForDelete;
    }
}
