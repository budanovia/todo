package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RestController
class UsersController {

    private final UsersRepository repository;

    UsersController(UsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<Users> all() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    Users one(@PathVariable Long id) throws UsersNotFoundException {

        return repository.findById(id)
                .orElseThrow(() -> new UsersNotFoundException(id));
    }

    @PostMapping("/users")
    Users newUser(@RequestBody Users newUser) {
        String encodedPassword = new BCryptPasswordEncoder().encode(newUser.getPassword());
        newUser.setPassword(encodedPassword);
        return repository.save(newUser);
    }

    @PutMapping("/users/{id}")
    Users replaceUser(@RequestBody Users newUser, @PathVariable Long id) {
        return newUser;
        /*return repository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    return repository.save(newUser);
                });*/
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
