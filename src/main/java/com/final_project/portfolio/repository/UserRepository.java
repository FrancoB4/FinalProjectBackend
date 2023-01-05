package com.final_project.portfolio.repository;

import com.final_project.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User user = null;
    List<User> findAll();
}
