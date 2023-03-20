package com.pasmurtsev.spring.springboot.spring_rest.springboot_rest.dao;

import com.pasmurtsev.spring.springboot.spring_rest.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
