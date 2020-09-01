package com.example.qa.bottles.domain;

import javax.persistence.*;

@Entity
public class AlcoholBrand {

    @Id
    @GeneratedValue
    private Long alcoholBrandId;

    @Column
    private String name;

    @OneToMany(targetEntity = Bottle.class)
    private Bottle bottle;

    public AlcoholBrand(){
    }

    public AlcoholBrand(String name){
        this.name = name;
    }

    public Long getAlcoholBrandId() {
        return alcoholBrandId;
    }

   /* public void setAlcoholBrandId(Long alcoholBrandId) {
        this.alcoholBrandId = alcoholBrandId;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
