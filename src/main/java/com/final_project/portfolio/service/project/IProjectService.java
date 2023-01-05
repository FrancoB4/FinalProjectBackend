package com.final_project.portfolio.service.project;

import com.final_project.portfolio.model.Project;
import java.util.List;

public interface IProjectService {
    public List<Project> getProjects();
    public void saveProject(Project project);
    public void deleteProject(Long id);
    public Project getProject(Long id);

}
