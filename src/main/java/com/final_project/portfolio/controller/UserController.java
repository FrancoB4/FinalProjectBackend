package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.Project;
import com.final_project.portfolio.model.User;
import com.final_project.portfolio.service.project.IProjectService;
import com.final_project.portfolio.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> getProjects() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getProject(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users/create")
    public String saveProject(User user) {
        userService.saveUser(user);
        return "Project correctly created";
    }

    @DeleteMapping("/users/{id}")
    public String deleteProject(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Project correctly deleted";
    }
}
