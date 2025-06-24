package com.Joane.santander_api_2025.controller;


import com.Joane.santander_api_2025.domain.User;
import com.Joane.santander_api_2025.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public User create(@RequestBody @Valid User user) {
        return service.save(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody @Valid User user) {
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
