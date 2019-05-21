package com.codeclan.EmployeeLab1.repositories;

import com.codeclan.EmployeeLab1.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
