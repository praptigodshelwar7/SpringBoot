package com.example.Application.management.Repository;

import com.example.Application.management.Entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ApplicantCrudRepository extends ListCrudRepository<Applicant, Long> {

}
