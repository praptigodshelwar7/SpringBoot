package com.praptiGodshelwar.IntroductionToSpringBoot.controller;

import com.praptiGodshelwar.IntroductionToSpringBoot.dto.EmployeeDTO;
import com.praptiGodshelwar.IntroductionToSpringBoot.entity.Employee;
import com.praptiGodshelwar.IntroductionToSpringBoot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping(value="/getEmployee/{id}", produces = "application/json")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {
        EmployeeDTO employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }


}
