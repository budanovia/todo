/*package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
class UserController {

    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) throws UserNotFoundException {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }

    @PutMapping("/users/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {
        return newUser;
        /*return repository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    return repository.save(newUser);
                });*/
/*    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}*/
