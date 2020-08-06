package com.udemy.spring.boot.customer.democrud.rest;

import com.udemy.spring.boot.customer.democrud.DemocrudApplication;
import com.udemy.spring.boot.customer.democrud.dao.EmployeeDao;
import com.udemy.spring.boot.customer.democrud.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeRestController(EmployeeDao theEmployeeDao) {
        employeeDao = theEmployeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        logger.info("retrieving all employees data");
        return employeeDao.findAll();
    }
}
