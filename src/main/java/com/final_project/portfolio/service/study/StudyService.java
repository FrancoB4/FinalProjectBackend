package com.final_project.portfolio.service.study;

import com.final_project.portfolio.model.Study;
import com.final_project.portfolio.repository.StudyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService implements IStudyService {
    StudyRepository studyRepository;

    @Override
    public List<Study> getStudies() { return studyRepository.findAll(); }

    @Override
    public void saveStudy(Study study) { studyRepository.save(study); }

    @Override
    public void deleteStudy(Long id) { studyRepository.deleteById(id); }

    @Override
    public Study getStudy(Long id) { return studyRepository.findById(id).orElse(null); }
}
