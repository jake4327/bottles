package com.example.qa.bottles.repo;

import com.example.qa.bottles.domain.AlcoholBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholBrandRepository extends JpaRepository<AlcoholBrand, Long> {
}
