package com.org.haritha.service;

import com.org.haritha.model.Employee;
import com.org.haritha.repository.EmployeeRepository;
import com.org.haritha.services.EmployeeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class EmployeeImplTest {

    @InjectMocks
    EmployeeImpl employeeImpl;

    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void getEmployeDetails(){
        Employee employee=new Employee();
        employee.setId(101);
        employee.setEmpName("raju");
        List <Employee>l=new ArrayList<>();
        l.add(employee);
        Mockito.when(employeeRepository.findAll()).thenReturn(l);

        employeeImpl.getAllEmployee();
        Assertions.assertEquals(l.get(0).getEmpName(),"raju");

    }

}
