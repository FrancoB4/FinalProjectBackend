package com.final_project.portfolio.service.competence;

import com.final_project.portfolio.model.Competence;
import com.final_project.portfolio.repository.CompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceService implements ICompetenceService {
    @Autowired
    private CompetenceRepository competenceRepository;

    @Override
    public List<Competence> getCompetences() { return competenceRepository.findAll(); }

    @Override
    public void saveCompetence(Competence competence) {
        competenceRepository.save(competence);
    }

    @Override
    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }

    @Override
    public Competence getCompetence(Long id) {
        return competenceRepository.findById(id).orElse(null);
    }
}
