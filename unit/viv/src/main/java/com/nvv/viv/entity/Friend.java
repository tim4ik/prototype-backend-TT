package com.nvv.viv.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "friends")
@Getter
@Setter
@NoArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long id;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Message> messageList = new ArrayList<>();

    public void addMessage(Message message){
        if(!this.messageList.contains((message))){
            this.messageList.add(message);
            message.setClient(client);
        }
    }

    public void removeMessage(Message message){
        if(this.messageList.contains((message))){
            this.messageList.remove(message);
            message.setClient(null);
        }
    }
}
