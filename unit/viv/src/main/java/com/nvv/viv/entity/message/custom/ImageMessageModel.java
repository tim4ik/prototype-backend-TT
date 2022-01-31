package com.nvv.viv.entity.message.custom;

import com.nvv.viv.entity.data.FileModel;
import com.nvv.viv.entity.message.BaseMessageModel;

import javax.persistence.*;

@Entity(name = "images")
public class ImageMessageModel extends BaseMessageModel {
    public ImageMessageModel() {
    }

    public ImageMessageModel(long id) {
        super(id);
    }

    public ImageMessageModel(FileModel fileModel) {
        this.fileModel = fileModel;
    }

    public ImageMessageModel(long id, FileModel fileModel) {
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
