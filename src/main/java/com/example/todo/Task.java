package com.example.todo;

import jakarta.persistence.*;

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

    public Task() {

    }

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, String description) {

        this.title = title;
        this.description = description;
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


}

