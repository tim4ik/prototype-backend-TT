package com.nvv.viv.entity.user;

import com.nvv.viv.abstracts.EntityDataBase;
import com.nvv.viv.entity.data.FileModel;

import javax.persistence.*;


@Entity(name = "profiles")
public class ClientProfileModel extends EntityDataBase {
    public ClientProfileModel() {
    }

    public ClientProfileModel(long id, String firstName, String lastName, String username, String phoneNumber, String bio, long registrationDate, boolean active, long birthday, FileModel avatar) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.registrationDate = registrationDate;
        this.active = active;
        this.birthday = birthday;
        this.avatar = avatar;
    }

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String phoneNumber;
    @Column
    private String bio;
    @Column(nullable = false)
    private long registrationDate;
    @Column(nullable = false)
    private boolean active;
    @Column(nullable = false)
    private long birthday;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_model_id")
    private FileModel avatar;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBio() {
        return bio;
    }

    public long getRegistrationDate() {
        return registrationDate;
    }

    public boolean isActive() {
        return active;
    }

    public long getBirthday() {
        return birthday;
    }

    public FileModel getAvatar() {
        return avatar;
    }
}
