package com.praptiGodshelwar.IntroductionToSpringBoot.service;

import com.praptiGodshelwar.IntroductionToSpringBoot.dto.EmployeeDTO;
import com.praptiGodshelwar.IntroductionToSpringBoot.entity.Employee;
import com.praptiGodshelwar.IntroductionToSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(Integer id) {
        //business logic
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);

    }
}
