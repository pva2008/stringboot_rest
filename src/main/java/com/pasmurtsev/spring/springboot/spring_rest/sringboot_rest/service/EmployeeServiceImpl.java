package com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.service;

import com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.dao.EmployeeDAO;
import com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        return employeeDAO.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//
//    }

}
