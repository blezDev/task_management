package com.blez.task_manager.repository;


import com.blez.task_manager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Additional query methods, if needed
}