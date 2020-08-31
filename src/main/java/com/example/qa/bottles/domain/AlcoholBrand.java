package com.example.qa.bottles.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AlcoholBrand {

    @Id
    @GeneratedValue
    private Long alcoholBrandId;

    @Column
    private String name;

    public AlcoholBrand(){
    }

    public AlcoholBrand(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
