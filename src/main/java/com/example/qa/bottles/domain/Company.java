package com.example.qa.bottles.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Company {

    @Id
    @GeneratedValue
    private Long companyId;

    @Column
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
