package com.final_project.portfolio.service.study;

import com.final_project.portfolio.model.Study;

import java.util.List;

public interface IStudyService {
    public List<Study> getStudies();
    public void saveStudy(Study study);
    public void deleteStudy(Long id);
    public Study getStudy(Long id);
}
