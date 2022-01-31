package com.nvv.viv.entity.message;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.*;

@Entity(name = "base_messages")
public class BaseMessageModel extends EntityDataBase {
    public BaseMessageModel() {
    }

    public BaseMessageModel(long id) {
        super(id);
    }

    public BaseMessageModel(String info, boolean accepted, ClientModel clientModel) {
        this.info = info;
        this.accepted = accepted;
        this.clientModel = clientModel;
    }

    public BaseMessageModel(long id, String info, boolean accepted, ClientModel clientModel) {
        super(id);
        this.info = info;
        this.accepted = accepted;
        this.clientModel = clientModel;
    }

    @Column(nullable = false)
    private String info;
    @Column(nullable = false)
    private boolean accepted = true;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel clientModel;

    public ClientModel getClientModel() {
        return clientModel;
    }

    public String getBody() {
        return info;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public String getInfo() {
        return info;
    }
}
