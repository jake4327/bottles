package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Company;
import com.example.qa.bottles.domain.Company;
import com.example.qa.bottles.service.CompanyService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete_company/{id}")
    public Boolean deleteCompany(@PathVariable Long id){
        return this.companyService.deleteCompanyById(id);
    }

    @GetMapping("/get_company_by_id/{id}")
    public Company getCompanyById(@PathVariable Long id){
        return this.companyService.findCompanyById(id);
    }
}
