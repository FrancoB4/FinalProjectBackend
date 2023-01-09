package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.Study;
import com.final_project.portfolio.service.study.IStudyService;
import com.final_project.portfolio.service.study.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudyController {
    @Autowired
    private IStudyService studyService;

    @GetMapping("/study")
    public List<Study> getStudies() { return studyService.getStudies(); }

    @GetMapping("/study/{id}")
    public Study getStudy(@PathVariable Long id) { return studyService.getStudy(id); }

    @PostMapping("/study/create")
    public String createStudy(Study study) {
        studyService.saveStudy(study);
        return "Study correctly created";
    }

    @DeleteMapping("/study/{id}")
    public String deleteStudy(@PathVariable Long id) {
        studyService.deleteStudy(id);
        return "Study correctly deleted";
    }
}
