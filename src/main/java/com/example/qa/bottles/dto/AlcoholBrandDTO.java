package com.example.qa.bottles.dto;

import com.example.qa.bottles.domain.Bottle;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AlcoholBrandDTO {



        private Long alcoholBrandId;
        private String name;
        private List<BottleDTO> bottles = new ArrayList<>();


        public AlcoholBrandDTO(){
        }

        public AlcoholBrandDTO(String name){
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


