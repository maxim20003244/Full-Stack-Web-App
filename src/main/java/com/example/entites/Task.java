package com.example.entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Task {
    @Id
    @GeneratedValue
    private long id;
    private String date;
    private String starTime;
    private String stopTime;
    private String description;
    @ManyToOne
    @JoinColumn(name = "USER_EMAIL")
    private User user;


    public Task() {
    }

    public Task(String date, String starTime, String stopTime, String description, User user) {
        this.date = date;
        this.starTime = starTime;
        this.stopTime = stopTime;
        this.description = description;
        this.user = user;
    }

    public Task(String date, String starTime, String stopTime, String description) {
        this.date = date;
        this.starTime = starTime;
        this.stopTime = stopTime;
        this.description = description;
    }
}
