package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Bar;
import com.example.qa.bottles.service.BarService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete_bar/{id}")
    public Boolean deleteBar(@PathVariable Long id){
        return this.barService.deleteBarById(id);
    }

    @GetMapping("/get_bar_by_id/{id}")
    public Bar getBarById(@PathVariable Long id){
        return this.barService.findBarById(id);
    }

    @PutMapping("/update_bar/{id}")
    public Bar updateBar(@PathVariable Long id, @RequestBody Bar bar){
        return this.barService.updateBar(id, bar);
    }

}
