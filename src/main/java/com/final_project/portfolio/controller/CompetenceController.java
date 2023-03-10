package com.final_project.portfolio.controller;

import com.final_project.portfolio.model.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.final_project.portfolio.service.competence.ICompetenceService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CompetenceController {
    @Autowired
    private ICompetenceService competenceService;

    @GetMapping("/competences")
    public List<Competence> getCompetences() { return competenceService.getCompetences(); }

    @GetMapping("/competences/{id}")
    public Competence getCompetence(@PathVariable Long id) { return competenceService.getCompetence(id); }

    @PostMapping("/competences/create")
    public String createCompetence(@RequestBody Competence competence) {
        competenceService.saveCompetence(competence);
        return "Competence correctly created";
    }

    @DeleteMapping("/competences/{id}")
    public String deleteCompetence(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
        return "Competence correctly deleted";
    }

    @PutMapping("/competences/{id}")
    public String updateCompetence(@PathVariable Long id,
                                   @RequestParam ("name") String newName,
                                   @RequestParam ("level") int newLevel) {

        Competence competence = competenceService.getCompetence(id);

        competence.setName(newName);
        competence.setLevel(newLevel);

        competenceService.saveCompetence(competence);
        return "Competence correctly updated";
    }
}
