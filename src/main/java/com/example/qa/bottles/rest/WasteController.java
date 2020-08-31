package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Waste;
import com.example.qa.bottles.service.WasteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class WasteController {

    private final WasteService wasteService;

    public WasteController(WasteService wasteService) {
        this.wasteService = wasteService;
    }

    @GetMapping("/")
    public List<Waste> getAllBrands(){
        return this.wasteService.readAllWastes();
    }

    @PostMapping("/create_waste")
    public  Waste createWaste(@RequestBody Waste waste){
        return this.wasteService.createWaste(waste);
    }

    @DeleteMapping("/delete_waste/{id}")
    public Boolean deleteWaste(@PathVariable Long id){
        return this.wasteService.deleteWasteById(id);
    }

    @GetMapping("/get_waste_by_id/{id}")
    public Waste getWasteById(@PathVariable Long id){
        return this.wasteService.findWasteById(id);
    }
}
