package com.nvv.viv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hashtags")
@Getter
@Setter
@NoArgsConstructor
public class HashTag {
    @Id
    @SequenceGenerator(name = "hashtag_profile_sequence", sequenceName = "hashtag_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hashtag_profile_sequence")
    @Column(name = "id", updatable = false)
    private long Id;

    @Column(name = "tag",unique = true, columnDefinition = "TEXT")
    private String value;
}
