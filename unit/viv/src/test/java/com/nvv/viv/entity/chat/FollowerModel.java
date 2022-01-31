package com.nvv.viv.entity.chat;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.chat.ChatModel;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.*;



@Entity(name = "followers")
public class FollowerModel extends EntityDataBase {
    public FollowerModel() {
    }

    public FollowerModel(long id) {
        super(id);
    }

    public FollowerModel(ChatModel chatModel, ClientModel follower) {
        this.chatModel = chatModel;
        this.follower = follower;
    }

    public FollowerModel(long id, ChatModel chatModel, ClientModel follower) {
        super(id);
        this.chatModel = chatModel;
        this.follower = follower;
    }

    @ManyToOne
    @JoinColumn(name = "chat_model_id")
    private ChatModel chatModel;


    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel follower;

    public ChatModel getChatModel() {
        return chatModel;
    }

    public ClientModel getFollower() {
        return follower;
    }
}
