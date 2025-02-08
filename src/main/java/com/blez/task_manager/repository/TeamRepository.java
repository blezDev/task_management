package com.blez.task_manager.repository;

import com.blez.task_manager.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Additional query methods, if needed
}
