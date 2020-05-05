package com.example.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Getter
@Setter
@Entity
public class Role {
    @Id
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
}
