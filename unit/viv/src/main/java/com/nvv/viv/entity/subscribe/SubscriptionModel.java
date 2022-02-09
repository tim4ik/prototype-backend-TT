package com.nvv.viv.entity.subscribe;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "subscriptions")
public class SubscriptionModel extends EntityDataBase {
    public SubscriptionModel() {
    }

    public SubscriptionModel(long id) {
        super(id);
    }

    public SubscriptionModel(ClientModel publisher, ClientModel subscriber) {
        this.publisher = publisher;
        this.subscriber = subscriber;
    }

    public SubscriptionModel(long id, ClientModel publisher, ClientModel subscriber) {
        super(id);
        this.publisher = publisher;
        this.subscriber = subscriber;
    }

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel publisher;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel subscriber;

    public ClientModel getPublisher() {
        return publisher;
    }

    public ClientModel getSubscriber() {
        return subscriber;
    }
}
