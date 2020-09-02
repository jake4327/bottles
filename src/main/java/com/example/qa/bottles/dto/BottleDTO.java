package com.example.qa.bottles.dto;


public class BottleDTO {

    private Long id;
    private String name;



    public BottleDTO(Float fullWeight, Float emptyWeight) {
        super();
    }

    public BottleDTO(String name) {
        super();
    }

    public BottleDTO() {
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
}
