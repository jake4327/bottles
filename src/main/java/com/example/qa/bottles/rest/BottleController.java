package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.service.BottleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class BottleController {

    private final BottleService bottleService;

    public BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @GetMapping("/")
    public List<Bottle> getAllBrands(){
        return this.bottleService.readAllBottles();
    }

    @PostMapping("/create_bottle")
    public  Bottle createBottle(@RequestBody Bottle bottle){
        return this.bottleService.createBottle(bottle);
    }
}
