package com.example.qa.bottles.repo;

import com.example.qa.bottles.domain.Waste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRepository extends JpaRepository<Waste, Long> {
}
