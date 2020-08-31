package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.service.BottleService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete_bottle/{id}")
    public Boolean deleteBottle(@PathVariable Long id){
        return this.bottleService.deleteBottleById(id);
    }

    @GetMapping("/get_bottle_by_id/{id}")
    public Bottle getBottleById(@PathVariable Long id){
        return this.bottleService.findBottleById(id);
    } 
    @PutMapping("/update_bottle/{id}")
    public Bottle updateBottle(@PathVariable Long id, @RequestBody Bottle bottle){
        return this.bottleService.updateBottle(id, bottle);
    }
    
    
}
