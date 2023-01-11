package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.Study;
import com.final_project.portfolio.service.study.IStudyService;
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
    public String createStudy(@RequestBody Study study) {
        studyService.saveStudy(study);
        return "Study correctly created";
    }

    @DeleteMapping("/study/{id}")
    public String deleteStudy(@PathVariable Long id) {
        studyService.deleteStudy(id);
        return "Study correctly deleted";
    }

    @PutMapping("/study/edit/{id}")
    public String editUser(@PathVariable Long id,
                           @RequestParam ("institution") String institution,
                           @RequestParam ("description") String description,
                           @RequestParam ("date") String date,
                           @RequestParam ("state") String state) {

        Study study = studyService.getStudy(id);

        study.setInstitution(institution);
        study.setDescription(description);
        study.setStartDate(date);
        study.setState(state);

        studyService.saveStudy(study);

        return "Study correctly created";
    }
}
