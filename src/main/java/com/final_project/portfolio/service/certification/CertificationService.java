package com.final_project.portfolio.service.certification;

import com.final_project.portfolio.model.Certification;
import com.final_project.portfolio.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService implements ICertificationService {
    @Autowired
    private CertificationRepository certificationRepository;

    @Override
    public List<Certification> getProjects() {
        return null;
    }

    @Override
    public void saveProject(Certification project) {

    }

    @Override
    public void deleteProject(Long id) {

    }

    @Override
    public Certification getProject(Long id) {
        return null;
    }
}
