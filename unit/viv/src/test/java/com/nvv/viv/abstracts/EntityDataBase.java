package com.nvv.viv.abstracts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public abstract class EntityDataBase extends ProgramObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public EntityDataBase() {
    }

    public EntityDataBase(long id) {
         this.id = id;
    }

    public long getId() {
        return id;
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
