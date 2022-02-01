package com.nvv.viv.repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "friends")
public class FriendModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    ClientModel clientModel;

    @OneToMany(targetEntity = RoomMessageModel.class, mappedBy = "clientModel", fetch = FetchType.EAGER)
    List<RoomMessageModel> roomMessageModelList = new ArrayList<>();
}
