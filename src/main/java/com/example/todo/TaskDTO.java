package com.example.todo;

import jakarta.persistence.*;

public class TaskDTO {
    private String title;
    private String description;

    public TaskDTO() {
    }

    public TaskDTO(String title, String description)
    {
        this.title = title;
        this.description = description;
    }
}
