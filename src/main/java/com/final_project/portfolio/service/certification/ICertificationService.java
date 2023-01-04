package com.final_project.portfolio.service.certification;

import com.final_project.portfolio.model.Certification;

import java.util.List;

public interface ICertificationService {
    public List<Certification> getProjects();
    public void saveProject(Certification project);
    public void deleteProject(Long id);
    public Certification getProject(Long id);
}
