package com.example.Application.management.Controller;

import com.example.Application.management.Entity.Applicant;
import com.example.Application.management.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplicants() {
        return applicantService.getAllApplicants();
    }
    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicantCrud(applicant);
    }
    @GetMapping("/page")
    public Iterable<Applicant> getApplicantsWithPagination(@RequestParam int page, @RequestParam int size) {
        return applicantService.getApplicantsWithPagination(page,size);
    }
    @GetMapping("/getByStatus")
    public List<Applicant> getApplicantsByStatus(@RequestParam String status) {
        return applicantService.getApplicantByStatus(status);
    }
    @GetMapping("/getByName")
    public List<Applicant> getApplicantByPartialName(@RequestParam String name) {
        return applicantService.getApplicantByPartialName(name);
    }
}
