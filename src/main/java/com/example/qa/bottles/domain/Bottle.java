package com.example.qa.bottles.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bottle {

    @Id
    @GeneratedValue
    private Long bottleId;

    @Column
    private Float newWeight;

    @Column
    private Float oldWeight;

    @Column
    private Float currentWeight;

    @Column
    private Float fullWeight;

    @Column
    private Float emptyWeight;

    @Column
    private String name;

    public Bottle(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Bottle(Float fullWeight, Float emptyWeight) {
        this.fullWeight = fullWeight;
        this.emptyWeight = emptyWeight;
    }

    public Bottle(Bottle bottle) {
        this.fullWeight = bottle.fullWeight;
        this.emptyWeight = bottle.emptyWeight;
        this.currentWeight = bottle.currentWeight;
    }

    public Bottle() {
    }

    public Float getNewWeight() {
        return newWeight;
    }

    public void setNewWeight(Float newWeight) {
        this.newWeight = newWeight;
    }

    public Float getOldWeight() {
        return oldWeight;
    }

    public void setOldWeight(Float oldWeight) {
        this.oldWeight = oldWeight;
    }

    public Float getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Float getFullWeight() {
        return fullWeight;
    }

    public void setFullWeight(Float fullWeight) {
        this.fullWeight = fullWeight;
    }

    public Float getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(Float emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
