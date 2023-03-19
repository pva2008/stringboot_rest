package com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.dao;

import com.pasmurtsev.spring.springboot.spring_rest.sringboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;

import org.hibernate.query.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override

    public List<Employee> getAllEmployees() {

        Session session = entityManager.unwrap(Session.class);
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//
//        Session session = sessionFactory.getCurrentSession();
//
//
//        session.saveOrUpdate(employee);
//
//    }

//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee  where id = :employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//
//    }
}
