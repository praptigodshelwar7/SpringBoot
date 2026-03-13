package com.example.Application.management.Service;

import com.example.Application.management.Entity.Applicant;
import com.example.Application.management.Repository.ApplicantCrudRepository;
import com.example.Application.management.Repository.ApplicantJpaRepository;
import com.example.Application.management.Repository.ApplicantPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {
    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;
    @Autowired
    private ApplicantPagingAndSortingRepository applicantPagingAndSortingRepository;
    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;

    public List<Applicant> getAllApplicants() {
        return applicantCrudRepository.findAll();
    }
    public Applicant saveApplicantCrud(Applicant applicant) {
        return applicantCrudRepository.save(applicant);

    }
    public List<Applicant> getApplicantByStatus(String status) {
        return applicantJpaRepository.findByStatusOrderByNameAsc(status);
    }
    public List<Applicant> getApplicantByPartialName(String name) {
        return applicantJpaRepository.findApplicantsByPartialName(name);
    }

    public Iterable<Applicant> getApplicantsWithPagination(int page, int size) {
        return applicantPagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }
}
