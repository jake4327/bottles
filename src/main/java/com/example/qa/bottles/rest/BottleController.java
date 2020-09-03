package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.dto.BottleDTO;
import com.example.qa.bottles.service.BottleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class BottleController {

    private final BottleService bottleService;

    public BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/get_bottles")
    public ResponseEntity<List<BottleDTO>> getAllBrands(){
        return ResponseEntity.ok(this.bottleService.readAllBottles());
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/create_bottle")
    public ResponseEntity<BottleDTO> createBottle(@RequestBody Bottle bottle){
        return new ResponseEntity<BottleDTO>(this.bottleService.createBottle(bottle), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete_bottle/{id}")
    public ResponseEntity<?> deleteBottle(@PathVariable Long id){
        return this.bottleService.deleteBottleById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/get_bottle_by_id/{id}")
    public ResponseEntity<BottleDTO> getBottleById(@PathVariable Long id){
        return  ResponseEntity.ok(this.bottleService.findBottleById(id));
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/update_bottle/{id}")
    public ResponseEntity<BottleDTO> updateBottle(@PathParam("id") Long id, @RequestBody Bottle bottle){
        return ResponseEntity.ok(this.bottleService.updateBottle(id, bottle));
    }


}
