package com.nvv.viv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements UserDetails {
    @Id
    @SequenceGenerator(name = "client_profile_sequence", sequenceName = "client_profile_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_profile_sequence")
    @Column(name = "id", updatable = false)
    private long id;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(name ="client_date" ,nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "login",unique = true, nullable = false, columnDefinition = "TEXT", updatable = false)
    @JsonIgnore
    private String email;

    @Column(name = "password" ,nullable = false, columnDefinition = "TEXT")
    @JsonIgnore
    private String password;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "profile_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "client_profile_fk"))
    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "client", orphanRemoval = true)
    private List<Post> postList = new ArrayList<>();

    @ElementCollection(targetClass = ERole.class)
    @CollectionTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"))
    private Set<ERole> role = new HashSet<>();

    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword(){
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
