package com.codeclan.EmployeeLab1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "employee_num")
    private int employeNum;


    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "employees_projects", joinColumns = {@JoinColumn(name = "employee_id", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "project_id", nullable = false, updatable = false)})
    private List<Project> projects;


    public Employee(String firsName, String lastName, int employeNum, Department department) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.employeNum = employeNum;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee(){
    }

    public Long getId() {
        return id;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeNum() {
        return employeNum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeNum(int employeNum) {
        this.employeNum = employeNum;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addProject(Project project){
        projects.add(project);
    }
}
