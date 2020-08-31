package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.domain.Bar;
import com.example.qa.bottles.service.AlcoholBrandService;
import com.example.qa.bottles.service.BarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BarController {

    private final BarService barService;

    public BarController(BarService barService) {
        this.barService = barService;
    }

    @GetMapping("/")
    public List<Bar> getAllBrands(){
        return this.barService.readAllBars();
    }

    @PostMapping("/create_bar")
    public  Bar createBar(@RequestBody Bar bar){
        return this.barService.createBar(bar);
    }
}
