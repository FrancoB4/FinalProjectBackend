package com.final_project.portfolio.controller;


import com.final_project.portfolio.model.Certification;
import com.final_project.portfolio.service.certification.ICertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CertificationController {
    @Autowired
    private ICertificationService certificationService;

    @GetMapping("/certifications")
    public List<Certification> getProjects() {
        return certificationService.getProjects();
    }

    @GetMapping("/certifications/{id}")
    public Certification getProject(@PathVariable Long id) {
        return certificationService.getProject(id);
    }

    @PostMapping("/certifications/create")
    public String saveProject(Certification certification) {
        certificationService.saveProject(certification);
        return "Project correctly created";
    }

    @DeleteMapping("/certifications/{id}")
    public String deleteProject(@PathVariable Long id) {
        certificationService.deleteProject(id);
        return "Project correctly deleted";
    }
}
