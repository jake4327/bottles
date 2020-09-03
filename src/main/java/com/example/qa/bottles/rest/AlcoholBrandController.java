package com.example.qa.bottles.rest;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.dto.AlcoholBrandDTO;
import com.example.qa.bottles.service.AlcoholBrandService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;


@RestController
public class AlcoholBrandController {

    private final AlcoholBrandService alcoholBrandService;

    public AlcoholBrandController(AlcoholBrandService alcoholBrandService) {
        this.alcoholBrandService = alcoholBrandService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/get_brands")
    public ResponseEntity<List<AlcoholBrandDTO>> getAllBrands(){
        //System.out.println(Arrays.toString(this.alcoholBrandService.readAllAlcoholBrands().toArray()));
        return ResponseEntity.ok(this.alcoholBrandService.readAllAlcoholBrands());
    }
    /*@GetMapping("/")
    public ResponseEntity<List<NoteDTO>> getAllNotes(){
        return ResponseEntity.ok(this.noteService.readAllNotes());
    }*/

    @CrossOrigin(origins = "*")
    @PostMapping("/create_brand")
    public ResponseEntity<AlcoholBrandDTO> createAlcoholBrand(@RequestBody AlcoholBrand alcoholBrand){
        return new ResponseEntity<AlcoholBrandDTO>(this.alcoholBrandService.createAlcoholBrand(alcoholBrand), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/delete_alcoholBrand/{id}")
    public ResponseEntity<?> deleteAlcoholBrand(@PathVariable Long id){
        return this.alcoholBrandService.deleteAlcoholBrandById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/get_alcoholBrand_by_id/{id}")
    public ResponseEntity<AlcoholBrandDTO> getAlcoholBrandById(@PathVariable Long id){
        return ResponseEntity.ok(this.alcoholBrandService.findAlcoholBrandById(id));
    }


    @CrossOrigin(origins = "*")
    @PutMapping("/update_alcohol_brand/{id}")
    public AlcoholBrandDTO updateAlcoholBrand(@PathVariable Long id, @RequestBody AlcoholBrand alcoholBrand){
        System.out.println("id: "+ id + "alcholobj" + alcoholBrand);
        return this.alcoholBrandService.updateAlcoholBrand(id, alcoholBrand);
    }
}
