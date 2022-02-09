package com.nvv.viv.abstracts;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public abstract class EntityDataBase extends ProgramObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    private LocalDateTime createdDate;

    public EntityDataBase() {
    }

    public EntityDataBase(long id) {
        this.id = id;
    }

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EntityDataBase entityDataBase = (EntityDataBase) o;
        return id == entityDataBase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public int compareTo(Object o) {
        EntityDataBase e = (EntityDataBase) o;
        return Long.compare(id, e.id);
    }


}
