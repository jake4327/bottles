package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.Company;
import com.example.qa.bottles.repo.CompanyRepository;
import com.example.qa.bottles.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository repo;

    @Autowired
    public CompanyService(CompanyRepository repo) {
        this.repo = repo;
    }

    public List<Company> readAllCompanies(){
        return this.repo.findAll();
    }

    public Company createCompany(Company company){
        return this.repo.save(company);
    }

    public Company findCompanyById(Long id){
        //return this.repo.findById(id).orElseThrow(CompanyNotFoundException::new);
        return null;
    }

    public Company updateCompany(Long id, Company company){
        Company update = findCompanyById(id);
        update.setName(company.getName());
        return this.repo.save(update);
    }

    public Boolean deleteCompanyById(Long id){
        if(!this.repo.existsById(id)){
            //throw new NoteNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}
