package com.example.todo;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(Long id) {
        super("Could not find task with id: " + id);
    }

}