package com.codeclan.EmployeeLab1;

import com.codeclan.EmployeeLab1.models.Department;
import com.codeclan.EmployeeLab1.models.Employee;
import com.codeclan.EmployeeLab1.models.Project;
import com.codeclan.EmployeeLab1.repositories.DepartmentRepository;
import com.codeclan.EmployeeLab1.repositories.EmployeeRepository;
import com.codeclan.EmployeeLab1.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void checkCreateEmployee(){
		Department finance = new Department("Finance");
		departmentRepository.save(finance);

		Employee charlie = new Employee("Churlie", "Walker", 1224, finance);
		employeeRepository.save(charlie);
	}

	@Test
	public void canCreateEmployeeAndProject(){
		Department finance = new Department("Finance");
		departmentRepository.save(finance);

		Employee charlie = new Employee("Churlie", "Walker", 1224, finance);
		employeeRepository.save(charlie);

		Project project = new Project("Getting Muney Honey", 60);
		project.addEmployee(charlie);
		projectRepository.save(project);


	}

}
