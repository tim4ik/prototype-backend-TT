package com.nvv.viv.entity.chat;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.message.BaseMessageModel;
import com.nvv.viv.entity.message.custom.ImageMessageModel;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "chat_messages")
public class ChatMessageModel extends EntityDataBase {
    public ChatMessageModel() {
    }

    public ChatMessageModel(long id) {
        super(id);
    }

    public ChatMessageModel(ClientModel clientModel, BaseMessageModel baseMessageModel, ImageMessageModel imageMessageModel) {
        this.clientModel = clientModel;
        this.baseMessageModel = baseMessageModel;
        this.imageMessageModel = imageMessageModel;
    }

    public ChatMessageModel(long id, ClientModel clientModel, BaseMessageModel baseMessageModel, ImageMessageModel imageMessageModel) {
        super(id);
        this.clientModel = clientModel;
        this.baseMessageModel = baseMessageModel;
        this.imageMessageModel = imageMessageModel;
    }

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel clientModel;

    @ManyToOne
    @JoinColumn(name = "base_message_model_id")
    private BaseMessageModel baseMessageModel;

    @ManyToOne
    @JoinColumn(name = "image_message_model_id")
    private ImageMessageModel imageMessageModel;

    public ClientModel getClientModel() {
        return clientModel;
    }

    public ImageMessageModel getImageMessageModel() {
        return imageMessageModel;
    }

    public BaseMessageModel getBaseMessageModel() {
        return baseMessageModel;
    }
}
