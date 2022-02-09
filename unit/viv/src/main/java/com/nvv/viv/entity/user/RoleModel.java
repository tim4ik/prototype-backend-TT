package com.nvv.viv.entity.user;

import com.nvv.viv.abstracts.EntityDataBase;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "app_rules")
public class RoleModel extends EntityDataBase {
    public RoleModel() {
    }

    public RoleModel(long id) {
        super(id);
    }

    public RoleModel(String name) {
        this.name = name;
    }

    public RoleModel(long id, String name) {
        super(id);
        this.name = name;
    }

    @Column(name = "value")
    private String name;

    public String getName() {
        return name;
    }
}
