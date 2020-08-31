package com.example.qa.bottles.repo;


import com.example.qa.bottles.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
