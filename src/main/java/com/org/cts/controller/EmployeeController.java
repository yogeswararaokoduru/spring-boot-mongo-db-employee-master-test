package com.org.cts.controller;

import com.org.cts.model.Employe;
import com.org.cts.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/emp")
    public void createEmpRecord(@RequestBody Employe employe) {
        employeeRepo.save(employe);
    }
    @GetMapping("/allemp")
    public List<Employe> getAllRecordsFromDb() {
      return   employeeRepo.findAll();
    }

}
