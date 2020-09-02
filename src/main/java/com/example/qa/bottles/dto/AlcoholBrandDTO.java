package com.example.qa.bottles.dto;

import com.example.qa.bottles.domain.Bottle;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AlcoholBrandDTO {

        private Long id;
        private String name;
        private List<BottleDTO> bottles = new ArrayList<>();

        public AlcoholBrandDTO(){
        }

        public AlcoholBrandDTO(String name){
            super();
            this.name = name;
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

        public List<BottleDTO> getBottles() {
        return bottles;
    }

        public void setBottles(List<BottleDTO> bottles) {
            this.bottles = bottles;
        }
}


