/*package com.example.todo;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    //@Column(unique = false, nullable = false)
    //private String username;

    public Users() {}

    //public User(String username) {
//
     //    this.username = username;
    //}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/

//}
