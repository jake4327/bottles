package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.exceptions.AlcoholBrandNotFoundException;
import com.example.qa.bottles.repo.AlcoholBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlcoholBrandService {

    private final AlcoholBrandRepository repo;

    @Autowired
    public AlcoholBrandService(AlcoholBrandRepository repo) {
        this.repo = repo;
    }

    public List<AlcoholBrand> readAllAlcoholBrands(){
        return this.repo.findAll();
    }

    public AlcoholBrand createAlcoholBrand(AlcoholBrand alcoholBrand){
        return this.repo.save(alcoholBrand);
    }

    public AlcoholBrand findAlcoholBrandById(Long id){
        return this.repo.findById(id).orElseThrow(AlcoholBrandNotFoundException::new);

    }

    public AlcoholBrand updateAlcoholBrand(Long id, AlcoholBrand alcoholBrand){
        AlcoholBrand update = findAlcoholBrandById(id);
        update.setName(alcoholBrand.getName());
        return this.repo.save(update);
    }

    public Boolean deleteAlcoholBrandById(Long id){
        if(!this.repo.existsById(id)){
            throw new AlcoholBrandNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }


}
