package com.example.todo;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Users implements UserDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = false, nullable = false)
    private String username;
    @Column(unique = false, nullable = false)
    private String password;

    //@OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = false, cascade = CascadeType.ALL)
    //@JoinColumn(name = "users_id")
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Task> listTasks;
    //@JoinColumn(name = "users_id", nullable = false)
    /*@JoinTable(
            name="Task",
            joinColumns = @JoinColumn( name="users_id", nullable=false),
            inverseJoinColumns = @JoinColumn( name="task_id", nullable=false))*/

    public Users() {}

    public Users(String username, String password) {

        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTask(Task task) {
        task.setUsers(this);
        this.listTasks.add(task);
    }

}

/*package com.example.todo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(unique = false, nullable = false)
    private String username;
    @Column(unique = false, nullable = false)
    private String password;


    //@OneToMany(mappedBy = "users", fetch = FetchType.LAZY, orphanRemoval = false, cascade = CascadeType.ALL)
    //@JoinColumn(name = "users_id")
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Task> listTasks;
    //@JoinColumn(name = "users_id", nullable = false)
    //@JoinTable(
    //        name="Task",
    //        joinColumns = @JoinColumn( name="users_id", nullable=false),
    //        inverseJoinColumns = @JoinColumn( name="task_id", nullable=false))

    public Users() {}

    public Users(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addTask(Task task) {
        task.setUsers(this);
        this.listTasks.add(task);
    }

}*/
