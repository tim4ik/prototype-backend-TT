package com.nvv.viv.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "room_messages")
public class RoomMessageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String info;

    @Column
    LocalDateTime time = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    ClientModel clientModel;
}
