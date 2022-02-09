package com.nvv.viv.entity.post;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.message.BaseMessageModel;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "comments")
public class CommentMessageModel extends EntityDataBase {

    @ManyToOne
    @JoinColumn(name = "client_model_id") // whom
    private ClientModel clientModel;

    public ClientModel getClientModel() {
        return clientModel;
    }

    @ManyToOne
    @JoinColumn(name = "base_message_model_id") // how
    private BaseMessageModel baseMessageModel;

    public BaseMessageModel getBaseMessageModel() {
        return baseMessageModel;
    }

    @ManyToOne
    @JoinColumn(name = "post_model_id") // what
    private PostModel postModel;

    public PostModel getPostModel() {
        return postModel;
    }
}
