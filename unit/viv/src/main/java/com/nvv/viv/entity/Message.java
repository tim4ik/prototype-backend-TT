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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
