package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.AlcoholBrand;
import com.example.qa.bottles.dto.AlcoholBrandDTO;
import com.example.qa.bottles.exceptions.AlcoholBrandNotFoundException;
import com.example.qa.bottles.repo.AlcoholBrandRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlcoholBrandService {

    private final AlcoholBrandRepository repo;
    private final ModelMapper modelMapper;

    @Autowired
    public AlcoholBrandService(AlcoholBrandRepository repo, ModelMapper modelMapper) {
        this.repo = repo;
        this.modelMapper = modelMapper;
    }

    private AlcoholBrandDTO mapToDTO(AlcoholBrand alcoholBrand){
        return this.modelMapper.map(alcoholBrand, AlcoholBrandDTO.class);
    }

    public List<AlcoholBrandDTO> readAllAlcoholBrands(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public AlcoholBrandDTO createAlcoholBrand(AlcoholBrand alcoholBrand){
        return this.mapToDTO(repo.save(alcoholBrand));
    }

    public AlcoholBrandDTO findAlcoholBrandById(Long id){
        return this.mapToDTO(this.repo.findById(id).orElseThrow(AlcoholBrandNotFoundException::new));

    }

    public AlcoholBrandDTO updateAlcoholBrand(Long id, AlcoholBrand alcoholBrand){
        AlcoholBrand update = this.repo.findById(id).orElseThrow(AlcoholBrandNotFoundException::new);
        update.setName(alcoholBrand.getName());
        return this.mapToDTO(repo.save(update));
    }

    public Boolean deleteAlcoholBrandById(Long id){
        if(!this.repo.existsById(id)){
            throw new AlcoholBrandNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }


}
