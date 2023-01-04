package com.final_project.portfolio.service.project;

import com.final_project.portfolio.repository.ProjectRepository;
import com.final_project.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects;
    }

    @Override
    public void saveProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project getProject(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
}
