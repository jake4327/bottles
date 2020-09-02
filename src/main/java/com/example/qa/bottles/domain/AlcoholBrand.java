package com.example.qa.bottles.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AlcoholBrand {

    @Id
    @GeneratedValue
    private Long alcoholBrandId;

    @Column
    private String name;

    @OneToMany(mappedBy = "alcoholBrand", fetch = FetchType.LAZY)
    private List<Bottle> bottles = new ArrayList<>();

    public AlcoholBrand(){
    }

    public AlcoholBrand(String name){
        this.name = name;
    }

    public Long getAlcoholBrandId() {
        return alcoholBrandId;
    }

    public void setAlcoholBrandId(Long alcoholBrandId) {
        this.alcoholBrandId = alcoholBrandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bottle> getBottles() {
        return bottles;
    }

    public void setNotes(List<Bottle> notes) {
        this.bottles = bottles;
    }
}
