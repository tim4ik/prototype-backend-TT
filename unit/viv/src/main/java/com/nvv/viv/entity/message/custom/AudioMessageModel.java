package com.nvv.viv.entity.message.custom;

import com.nvv.viv.entity.data.FileModel;
import com.nvv.viv.entity.message.BaseMessageModel;

import javax.persistence.*;

@Entity(name = "audios")
public class AudioMessageModel extends BaseMessageModel {
    public AudioMessageModel() {
    }

    public AudioMessageModel(long id) {
        super(id);
    }

    public AudioMessageModel(FileModel fileModel) {
        this.fileModel = fileModel;
    }

    public AudioMessageModel(long id, FileModel fileModel) {
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
