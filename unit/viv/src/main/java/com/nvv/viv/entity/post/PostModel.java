package com.nvv.viv.entity.post;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.data.FileModel;
import com.nvv.viv.entity.user.ClientModel;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity(name = "posts")
public class PostModel extends EntityDataBase {
    public PostModel() {
    }

    public PostModel(long id) {
        super(id);
    }

    public PostModel(ClientModel clientModel, FileModel fileModel, List<CommentMessageModel> commentMessageModels, Collection<HashTagModel> hashtags, Collection<LikeModel> likes) {
        this.clientModel = clientModel;
        this.fileModel = fileModel;
        this.commentMessageModels = commentMessageModels;
        this.hashtags = hashtags;
        this.likes = likes;
    }

    public PostModel(long id, ClientModel clientModel, FileModel fileModel, List<CommentMessageModel> commentMessageModels, Collection<HashTagModel> hashtags, Collection<LikeModel> likes) {
        super(id);
        this.clientModel = clientModel;
        this.fileModel = fileModel;
        this.commentMessageModels = commentMessageModels;
        this.hashtags = hashtags;
        this.likes = likes;
    }

    @ManyToOne
    @JoinColumn(name = "client_model_id")
    private ClientModel clientModel;

    @ManyToOne
    @JoinColumn(name = "file_model_id")
    private FileModel fileModel;

    @OneToMany(mappedBy = "postModel")
    private List<CommentMessageModel> commentMessageModels;

    @ManyToMany
    @JoinTable(name = "hash_tags", joinColumns = @JoinColumn(name="post_model_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "hash_tag_model_id", referencedColumnName = "id"))
    private Collection<HashTagModel> hashtags;

    @ManyToMany
    @JoinTable(name = "likes", joinColumns = @JoinColumn(name="post_model_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "like_tag_model_id", referencedColumnName = "id"))
    private Collection<LikeModel> likes;

    public ClientModel getClientModel() {
        return clientModel;
    }

    public FileModel getFileModel() {
        return fileModel;
    }

    public List<CommentMessageModel> getCommentMessageModels() {
        return commentMessageModels;
    }

    public Collection<HashTagModel> getHashtags() {
        return hashtags;
    }

    public Collection<LikeModel> getLikes() {
        return likes;
    }
}
