package com.nvv.viv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @SequenceGenerator(name = "post_profile_sequence", sequenceName = "post_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_profile_sequence")
    @Column(name = "id", updatable = false)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "client_model_id", nullable = false)
    private Client client;

    @Column(name = "ldt_cr", nullable = false)
    private LocalDateTime localDateTime = LocalDateTime.now();

    @Lob
    private byte[] video;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @OneToMany(targetEntity = Like.class, mappedBy = "client")
    private List<Like> likes = new ArrayList<>();

    @OneToMany(targetEntity = HashTag.class, mappedBy = "value")
    private List<HashTag> tags = new ArrayList<>();

}
