package com.nvv.viv.repository;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "posts")
public class PostModel {
    @Id
    long Id;

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    ClientModel clientModel;

    @Column
    LocalDateTime localDateTime = LocalDateTime.now();

    @Lob
    byte[] video;

    @Column
    String description;

    @OneToMany(targetEntity = LikeModel.class, mappedBy = "clientModel", fetch = FetchType.EAGER)
    List<LikeModel> likes = new ArrayList<>();

    @OneToMany(targetEntity = HashTagModel.class, mappedBy = "value", fetch = FetchType.EAGER)
    List<HashTagModel> tags = new ArrayList<>();
}
