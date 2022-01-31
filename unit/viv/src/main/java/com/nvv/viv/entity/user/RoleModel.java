package com.nvv.viv.entity.user;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "rules")
public class RoleModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    private final LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "mark")
    private boolean markForDelete;
    public RoleModel() {
    }


    public RoleModel(String name) {
        this.name = name;
    }

    @Column(name = "value", unique = true, updatable = false)
    private String name;

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "RoleModel{" +
                "name='" + name + '\'' +
                '}';
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
}
