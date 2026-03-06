package com.praptiGodshelwar.IntroductionToSpringBoot.repository;

import com.praptiGodshelwar.IntroductionToSpringBoot.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id) {
        return new Employee(1,"Prapti","ECS",20);
    }
}
