package com.nvv.viv.entity.message.custom;

import com.nvv.viv.entity.data.FileModel;
import com.nvv.viv.entity.message.BaseMessageModel;

import javax.persistence.*;

@Entity(name = "videos")
public class VideoMessageModel extends BaseMessageModel {
    public VideoMessageModel() {
    }

    public VideoMessageModel(long id) {
        super(id);
    }

    public VideoMessageModel(FileModel fileModel) {
        this.fileModel = fileModel;
    }

    public VideoMessageModel(long id, FileModel fileModel) {
        super(id);
        this.fileModel = fileModel;
    }

    @OneToOne
    @JoinColumn(name = "file_model_id")
    private FileModel fileModel;

    public FileModel getFileModel() {
        return fileModel;
    }
}
