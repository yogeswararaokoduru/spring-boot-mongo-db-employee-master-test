package com.org.haritha.services;

import com.org.haritha.dto.Dept;
import com.org.haritha.model.Employee;
import com.org.haritha.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeIntefcae{

    @Autowired
    EmployeeRepository employeeRepository;



    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(int id) {
        return null;
    }

    @Override
    public List<Dept> getAllDeptDetail() {

       return null;
    }
}
