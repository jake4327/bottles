package com.example.qa.bottles.domain;

import javax.persistence.*;


@Entity
public class Bottle {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne(targetEntity = AlcoholBrand.class)
    private AlcoholBrand alcoholBrand;

    public Bottle(String name){
        this.name = name;
    }

    public Bottle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlcoholBrand getAlcoholBrand() {
        return alcoholBrand;
    }

    public void setAlcoholBrand(AlcoholBrand alcoholBrand) {
        this.alcoholBrand = alcoholBrand;
    }
}
