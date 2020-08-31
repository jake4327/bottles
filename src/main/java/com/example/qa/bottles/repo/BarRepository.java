package com.example.qa.bottles.repo;

import com.example.qa.bottles.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Bar, Long> {
}
