package com.example.qa.bottles.dto;


public class BottleDTO {

    private Long bottleId;
    private Float newWeight;
    private Float oldWeight;
    private Float currentWeight;
    private Float fullWeight;
    private Float emptyWeight;
    private String name;


    public BottleDTO(Float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public BottleDTO(Float fullWeight, Float emptyWeight) {
        this.fullWeight = fullWeight;
        this.emptyWeight = emptyWeight;
    }

    public BottleDTO(BottleDTO bottle) {
        this.fullWeight = bottle.fullWeight;
        this.emptyWeight = bottle.emptyWeight;
        this.currentWeight = bottle.currentWeight;
    }

    public BottleDTO() {
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
