package com.example.qa.bottles.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Waste {

    @Id
    @GeneratedValue
    private Long wasteId;

    @Column
    private Double totalWaste;

    public Waste() {
    }

    public Double getTotalWaste() {
        return totalWaste;
    }

    public void setTotalWaste(Double totalWaste) {
        this.totalWaste = totalWaste;
    }
}
