package com.spring_project.Springboottutorial.service;

import com.spring_project.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    Department fetchDepartmentByName(String departmentName);
}
