package com.udemy.spring.boot.customer.democrud.rest;

import com.udemy.spring.boot.customer.democrud.dao.EmployeeDao;
import com.udemy.spring.boot.customer.democrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController  {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeRestController(EmployeeDao theEmployeeDao)
    {
        employeeDao = theEmployeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
       return employeeDao.findAll();
    }
}
