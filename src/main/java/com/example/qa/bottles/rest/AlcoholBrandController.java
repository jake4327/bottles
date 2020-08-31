package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.service.AlcoholBrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlcoholBrandController {

    private final AlcoholBrandService alcoholBrandService;


    public AlcoholBrandController(AlcoholBrandService alcoholBrandService) {
        this.alcoholBrandService = alcoholBrandService;
    }

    @GetMapping("/get_brands")
    public List<AlcoholBrand> getAllBrands(){
        return this.alcoholBrandService.readAllAlcoholBrands();
    }

    @PostMapping("/create_brand")
    public  AlcoholBrand createAlcoholBrand(@RequestBody AlcoholBrand alcoholBrand){
        return this.alcoholBrandService.createAlcoholBrand(alcoholBrand);
    }

    @DeleteMapping("/delete_alcoholBrand/{id}")
    public Boolean deleteAlcoholBrand(@PathVariable Long id){
        return this.alcoholBrandService.deleteAlcoholBrandById(id);
    }

    @GetMapping("/get_alcoholBrand_by_id/{id}")
    public AlcoholBrand getAlcoholBrandById(@PathVariable Long id){
        return this.alcoholBrandService.findAlcoholBrandById(id);
    }

    @PutMapping("/update_alcoholBrand/{id}")
    public AlcoholBrand updateAlcoholBrand(@PathVariable Long id, @RequestBody AlcoholBrand alcoholBrand){
        return this.alcoholBrandService.updateAlcoholBrand(id, alcoholBrand);
    }
    
}
