package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.portfolio.service.project.IProjectService;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private IProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return projectService.getProjects();
    }

    @GetMapping("/projects/{id}")
    public Project getProject(@PathVariable Long id) {
        return projectService.getProject(id);
    }

    @PostMapping("/projects/create")
    public String saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
        return "Project correctly created";
    }

    @DeleteMapping("/projects/{id}")
    public String deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return "Project correctly deleted";
    }

    @PutMapping("/projects/{id}")
    public String updateProject(@PathVariable Long id,
                                @RequestParam ("name") String newName,
                                @RequestParam ("description") String newDescription,
                                @RequestParam ("url") String newUrl,
                                @RequestParam ("image") String newImage) {
        Project project = projectService.getProject(id);

        project.setName(newName);
        project.setDescription(newDescription);
        project.setUrl(newUrl);
        project.setImage(newImage);

        projectService.saveProject(project);
        return "Project correctly updated";
    }
}
