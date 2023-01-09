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
        return certificationRepository.findAll();
    }

    @Override
    public void saveProject(Certification certification) { certificationRepository.save(certification); }

    @Override
    public void deleteProject(Long id) { certificationRepository.deleteById(id); }

    @Override
    public Certification getProject(Long id) {
        return certificationRepository.findById(id).orElse(null);
    }
}
