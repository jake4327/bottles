package com.example.qa.bottles.repo;

import com.example.qa.bottles.domain.Waste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WasteRepository<Waste> extends JpaRepository<Waste, Long> {
}
