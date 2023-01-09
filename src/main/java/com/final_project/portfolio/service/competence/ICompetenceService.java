package com.final_project.portfolio.service.competence;

import com.final_project.portfolio.model.Competence;

import java.util.List;

public interface ICompetenceService {
    public List<Competence> getCompetences();
    public void saveCompetence(Competence competence);
    public void deleteCompetence(Long id);
    public Competence getCompetence(Long id);
}
