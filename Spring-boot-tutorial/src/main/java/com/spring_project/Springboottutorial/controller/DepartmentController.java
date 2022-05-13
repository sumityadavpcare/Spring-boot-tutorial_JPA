package com.spring_project.Springboottutorial.controller;


import com.spring_project.Springboottutorial.entity.Department;
import com.spring_project.Springboottutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted successfully";
    }

    @GetMapping("/departments/{id}/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName, @PathVariable("id") String id){
        if( id != null){
            return departmentService.fetchDepartmentByName(departmentName);
        }
        return null;
    }
}
