package com.nvv.viv.entity;

import com.nvv.viv.abstracts.EntityDataBase;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Table;


@Table(name = "files")
public class FileModel extends EntityDataBase {
    public FileModel() {
    }

    public FileModel(long id, String fileName, String fileType, byte[] data) {
        super(id);
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    @Column(nullable = false)
    private String fileName;
    @Column(nullable = false)
    private String fileType;
    @Lob
    private byte[] data;

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getData() {
        return data;
    }
}
