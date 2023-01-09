package com.final_project.portfolio.repository;

import com.final_project.portfolio.model.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {
    Competence competence = null;
    List<Competence> findAll();
}
