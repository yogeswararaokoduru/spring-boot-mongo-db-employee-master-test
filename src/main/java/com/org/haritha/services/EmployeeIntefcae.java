package com.org.haritha.services;

import com.org.haritha.dto.Dept;
import com.org.haritha.model.Employee;

import java.util.List;

public interface EmployeeIntefcae {

    public void createEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getById(int id);

    public List<Dept> getAllDeptDetail();
}
