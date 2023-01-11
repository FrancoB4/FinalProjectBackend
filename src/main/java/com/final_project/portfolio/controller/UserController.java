package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.User;
import com.final_project.portfolio.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users/create")
    public String saveUser(@RequestBody User user) {
        userService.saveUser(user);
        return "Project correctly created";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Project correctly deleted";
    }

    @PutMapping("/users/edit/{id}")
    public String editUser(@PathVariable Long id,
                         @RequestParam ("username") String newUsername,
                         @RequestParam ("password") String newPassword) {

        User user = userService.getUser(id);

        user.setUsername(newUsername);
        user.setPassword(newPassword);

        userService.saveUser(user);
        return "User correctly edited";
    }
}
