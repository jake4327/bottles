package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.dto.BottleDTO;
import com.example.qa.bottles.exceptions.BottleNotFoundException;
import com.example.qa.bottles.repo.BottleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BottleService {

    private final BottleRepository repo;
    private final ModelMapper modelMapper;

    @Autowired
    public BottleService(BottleRepository repo, ModelMapper modelMapper) {
        this.repo = repo;
        this.modelMapper = modelMapper;
    }

    private BottleDTO mapToBottleDTO(Bottle bottle){
        return this.modelMapper.map(bottle, BottleDTO.class);
    }

    public List<BottleDTO> readAllBottles(){
        return this.repo.findAll().stream().map(this::mapToBottleDTO).collect(Collectors.toList());
    }

    public BottleDTO createBottle(Bottle bottle){
        return this.mapToBottleDTO(this.repo.save(bottle));
    }

    public BottleDTO findBottleById(Long id){
        return this.mapToBottleDTO(repo.findById(id).orElseThrow(BottleNotFoundException::new));
    }

    public BottleDTO updateBottle(Long id, Bottle bottle){
        Bottle update = this.repo.findById(id).orElseThrow(BottleNotFoundException::new);
        update.setName(bottle.getName());
        return this.mapToBottleDTO(repo.save(update));
    }

    public Boolean deleteBottleById(Long id){
        if(!this.repo.existsById(id)){
            throw new BottleNotFoundException();
        }

        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
