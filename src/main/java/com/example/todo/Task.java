package com.example.todo;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = false, nullable = false)
    private String title;
    @Column(unique = false, nullable = true)
    private String description;

    //@JoinColumn(name = "users_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    public Task() {
        //this.users = users;
        //users = null;
    }

    public Task(String title) {
        //this.users= users;
        this.title = title;
        //users = null;
    }

    public Task(String title, String description) {
        //this.users = users;
        this.title = title;
        this.description = description;
        //users = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


}

