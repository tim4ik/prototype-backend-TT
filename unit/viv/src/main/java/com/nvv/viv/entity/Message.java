package com.nvv.viv.entity;

import com.nvv.viv.entity.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Getter
@Setter
@NoArgsConstructor
public class Message {
    @Id
    @SequenceGenerator(name = "message_profile_sequence", sequenceName = "message_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "body",nullable = false, columnDefinition = "TEXT")
    private String body; //1

    @Column(name = "massage_date",nullable = false)
    private LocalDateTime time;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private Client client;
}
