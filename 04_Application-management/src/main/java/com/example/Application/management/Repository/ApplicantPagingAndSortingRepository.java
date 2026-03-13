package com.example.Application.management.Repository;

import com.example.Application.management.Entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends ListPagingAndSortingRepository<Applicant,Long>, CrudRepository<Applicant,Long> {
}