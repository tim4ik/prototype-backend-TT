package com.nvv.viv.entity.post;

import com.nvv.viv.abstracts.EntityDataBase;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "hash_tags")
public class HashTagModel extends EntityDataBase {
    public HashTagModel() {
    }

    public HashTagModel(String value) {
        this.value = value;
    }

    public HashTagModel(long id, String value) {
        super(id);
        this.value = value;
    }

    public HashTagModel(long id) {
        super(id);
    }

    @Column(unique = true, nullable = false, length = 80)
    private String value;

    public String getValue() {
        return value;
    }
}
