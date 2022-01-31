package com.nvv.viv.entity.user;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;


@Entity(name = "profiles")
public class ClientProfileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    private final LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "mark")
    private boolean markForDelete = false;

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
    @Lob
    private byte[] avatar;

    public ClientProfileModel() {
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public boolean isMarkForDelete() {
        return markForDelete;
    }

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

    public byte[] getAvatar() {
        return avatar;
    }

    public void setMarkForDelete(boolean markForDelete) {
        this.markForDelete = markForDelete;
    }

    @Override
    public String toString() {
        return "ClientProfileModel{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", markForDelete=" + markForDelete +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bio='" + bio + '\'' +
                ", registrationDate=" + registrationDate +
                ", active=" + active +
                ", birthday=" + birthday +
                ", avatar=" + Arrays.toString(avatar) +
                '}';
    }

    public ClientProfileModel(String firstName, String lastName, String username, String phoneNumber, String bio, long registrationDate, long birthday, byte[] avatar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.registrationDate = registrationDate;
        this.birthday = birthday;
        this.avatar = avatar;
    }
}
