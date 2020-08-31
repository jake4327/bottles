package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.Bottle;
import com.example.qa.bottles.repo.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BottleService {

    private final BottleRepository repo;

    @Autowired
    public BottleService(BottleRepository repo) {
        this.repo = repo;
    }

    public List<Bottle> readAllBottles(){
        return this.repo.findAll();
    }

    public Bottle createBottle(Bottle noteBook){
        return this.repo.save(noteBook);
    }

    public Bottle findBottleById(Long id){
        //return this.repo.findById(id).orElseThrow(BottleNotFoundException::new);
        return null;
    }

    public Bottle updateBottle(Long id, Bottle bottle){
        Bottle update = findBottleById(id);
        update.setName(bottle.getName());
        return this.repo.save(update);
    }

    public Boolean deleteBottleById(Long id){
        if(!this.repo.existsById(id)){
            //throw new NoteNotFoundException();
        }

        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
    

    
    
}
