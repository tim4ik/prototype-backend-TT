package com.nvv.viv.entity.post;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.message.BaseMessageModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "likes")
public class LikeModel extends EntityDataBase {
    public LikeModel() {
    }

    public LikeModel(long id) {
        super(id);
    }

    public LikeModel(BaseMessageModel baseMessageModel) {
        this.baseMessageModel = baseMessageModel;
    }

    public LikeModel(long id, BaseMessageModel baseMessageModel) {
        super(id);
        this.baseMessageModel = baseMessageModel;
    }

    @ManyToOne
    @JoinColumn(name = "base_message_model_id", unique = true)
    private BaseMessageModel baseMessageModel;

    public BaseMessageModel getBaseMessageModel() {
        return baseMessageModel;
    }

}
