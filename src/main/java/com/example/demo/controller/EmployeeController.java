package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Employee;

@RestController
class EmployeeController{

    List<Employee> employees= new ArrayList<Employee>();

    @GetMapping("/employee")   
    List<Employee> all(){
        Employee employee= new Employee();
        employee.setName("Juan");
        employee.setJob("Computer Engineer");
        employees.add(employee);
        return employees;
    }

}