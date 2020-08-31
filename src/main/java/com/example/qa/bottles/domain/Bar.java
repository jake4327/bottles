package com.example.qa.bottles.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bar {

    @Id
    @GeneratedValue
    private Long barId;

    @Column
    private String name;

    @Column
    private Long temperature;

    public Bar(String name, Long temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public Bar(String name) {
        this.name = name;
    }

    public Bar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }
}
