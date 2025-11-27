package com.example.todo;

public class UsersNotFoundException extends Exception {
    public UsersNotFoundException(Long id) {
        super("Could not find user with id: " + id);
    }

}
