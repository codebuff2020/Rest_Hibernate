package com.udemy.spring.boot.customer.democrud.dao;

import com.udemy.spring.boot.customer.democrud.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> findAll();
}
