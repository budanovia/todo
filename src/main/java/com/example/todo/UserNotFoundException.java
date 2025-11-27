package com.example.todo;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(Long id) {
        super("Could not find user with id: " + id);
    }

}
