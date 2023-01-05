package com.final_project.portfolio.repository;

import com.final_project.portfolio.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
    Certification certification = null;
    List<Certification> findAll();

}