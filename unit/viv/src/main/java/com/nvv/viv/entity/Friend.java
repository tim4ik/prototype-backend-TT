package com.nvv.viv.entity;

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
    @SequenceGenerator(name = "friend_profile_sequence", sequenceName = "friend_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "friend_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private Client client;

    @OneToMany(targetEntity = Message.class, mappedBy = "client", fetch = FetchType.EAGER)
    private List<Message> messageList = new ArrayList<>();
}
