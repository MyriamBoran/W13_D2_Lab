package com.codeclan.EmployeeLab1.repositories;

import com.codeclan.EmployeeLab1.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
