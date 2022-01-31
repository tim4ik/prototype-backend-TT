package com.nvv.viv.abstracts;


import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public abstract class ProgramObject implements Serializable, Comparable<Object> {
    @Serial
    private static final long serialVersionUID = Constants.SERIALIZATION_VERSION_UID;
    private final long created = System.currentTimeMillis();

    public long getCreated() {
        return created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramObject that = (ProgramObject) o;
        return created == that.created;
    }

    @Override
    public int hashCode() {
        return Objects.hash(created);
    }

    @Override
    public String toString() {
        return "ProgramObject{" +
                "created=" + created +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        ProgramObject po = (ProgramObject) o;
        return Long.compare(created, po.created);
    }
}
