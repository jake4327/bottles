package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.service.AlcoholBrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlcoholBrandController {

    private final AlcoholBrandService alcoholBrandService;


    public AlcoholBrandController(AlcoholBrandService alcoholBrandService) {
        this.alcoholBrandService = alcoholBrandService;
    }

    @GetMapping("/")
    public List<AlcoholBrand> getAllBrands(){
        return this.alcoholBrandService.readAllAlcoholBrands();
    }

    @PostMapping("/create_brand")
    public  AlcoholBrand createAlcoholBrand(@RequestBody AlcoholBrand alcoholBrand){
        return this.alcoholBrandService.createAlcoholBrand(alcoholBrand);
    }
}
