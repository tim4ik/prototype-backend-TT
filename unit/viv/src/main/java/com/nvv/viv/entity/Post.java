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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private long Id;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "post_date", nullable = false)
    private LocalDateTime localDateTime;

    @Lob
    @Column(columnDefinition = "bytea")
    private byte[] video;

    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "client")
    private List<Like> likes = new ArrayList<>();

    public void addLike(Like like) {
        if (!likes.contains(like)) {
            likes.add(like);
            like.setClient(client);
        }
    }

    public void removeLike(Like like) {
        if (likes.contains(like)) {
            likes.remove(like);
            like.setClient(null);
        }
    }

    @OneToMany(targetEntity = HashTag.class, mappedBy = "value")
    private List<HashTag> tags = new ArrayList<>();

    public void addTag(HashTag hashTag) {
        if (!tags.contains(hashTag)) {
            tags.add(hashTag);
        }
    }

    public void removeLike(HashTag hashTag) {
        tags.remove(hashTag);
    }

    @Column(updatable = false)
    private LocalDateTime createdDate;
    @PrePersist
    protected void onCreate(){
        this.createdDate = LocalDateTime.now();
    }
}
