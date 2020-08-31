package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Company;
import com.example.qa.bottles.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/")
    public List<Company> getAllBrands(){
        return this.companyService.readAllCompanies();
    }

    @PostMapping("/create_company")
    public  Company createCompany(@RequestBody Company company){
        return this.companyService.createCompany(company);
    }
}
