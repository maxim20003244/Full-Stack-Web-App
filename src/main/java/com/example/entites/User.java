package com.example.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;
@Getter
@Setter
@Entity
public class User {

    @Id
    @Email
    @Column(unique = true)
    private String email;

    private String name;
    @Size(min=4)
    private String password;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Task> tasks;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE", joinColumns = {
            @JoinColumn(name = "USER_EMAIL", referencedColumnName = "email")
    },inverseJoinColumns = {@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name")

    })
    private List<Role> roles;

    public User(String email, String name, String password, List<Role> roles) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.roles = roles;
    }



}
