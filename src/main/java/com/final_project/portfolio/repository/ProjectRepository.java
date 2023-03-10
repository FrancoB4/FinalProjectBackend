package com.final_project.portfolio.repository;
import com.final_project.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Long> {
    Project project = null;
    List<Project> findAll();
}
