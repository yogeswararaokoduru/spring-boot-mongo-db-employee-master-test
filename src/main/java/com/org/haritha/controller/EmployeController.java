package com.org.haritha.controller;

import com.org.haritha.dto.Dept;
import com.org.haritha.model.Employee;
import com.org.haritha.services.EmployeeIntefcae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeController {

    @Autowired
    private EmployeeIntefcae employeeIntefcae;

    @PostMapping(value = "/create")
    public void addOwner(@RequestBody Employee employee) {
         employeeIntefcae.createEmployee(employee);
    }

    @GetMapping(value = "/getalldetails")
    public List<Employee> getallDetails() {
        return employeeIntefcae.getAllEmployee();
    }

    @GetMapping(value = "/getallDeptDetails")
    public List<Dept> getallDeptDetails() {
        return employeeIntefcae.getAllDeptDetail();
    }
}
