package com.final_project.portfolio.repository;

import com.final_project.portfolio.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long> {
    Study study = null;
    List<Study> findAll();
}
