package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class TaskController {

    private final TaskRepository repository;

    TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tasks")
    List<Task> all() {
        return repository.findAll();
    }

    @GetMapping("/tasks/{id}")
    Task one(@PathVariable Long id) throws TaskNotFoundException {

        return repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    @PostMapping("/tasks")
    Task newTask(@RequestBody Task newTask) {
        return repository.save(newTask);
    }

    @PutMapping("/tasks/{id}")
    Task replaceTask(@RequestBody Task newTask, @PathVariable Long id) {
        return newTask;
        /*return repository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    return repository.save(newUser);
                });*/
    }

    @DeleteMapping("/tasks/{id}")
    void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}


