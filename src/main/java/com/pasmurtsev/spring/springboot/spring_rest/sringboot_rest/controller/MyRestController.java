package com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.controller;

import com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.entity.Employee;

import com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {

        return employeeService.getAllEmployees();
    }

//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//        return employee;
//
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//        employeeService.deleteEmployee(id);
//        return "Employee with ID = " + id + " was deleted.";
//    }


}
