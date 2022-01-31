package com.nvv.viv.entity.chat;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "chats")
public class ChatModel extends EntityDataBase {
    public ChatModel() {
    }

    public ChatModel(long id) {
        super(id);
    }

    public ChatModel(ClientModel owner, List<FollowerModel> friends) {
        this.owner = owner;
        this.friends = friends;
    }

    public ChatModel(long id, ClientModel owner, List<FollowerModel> friends) {
        super(id);
        this.owner = owner;
        this.friends = friends;
    }

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel owner;

    @OneToMany(mappedBy = "chatModel")
    private List<FollowerModel> friends = new ArrayList<>();

    public ClientModel getOwner() {
        return owner;
    }

    public List<FollowerModel> getFriends() {
        return friends;
    }
}
