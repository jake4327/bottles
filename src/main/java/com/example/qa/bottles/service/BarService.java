package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.Bar;
import com.example.qa.bottles.repo.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarService {

    private final BarRepository repo;

    @Autowired
    public BarService(BarRepository repo) {
        this.repo = repo;
    }

    public List<Bar> readAllBars(){
        return this.repo.findAll();
    }

    public Bar createBar(Bar bar){
        return this.repo.save(bar);
    }

    public Bar findBarById(Long id){
        //return this.repo.findById(id).orElseThrow(BarNotFoundException::new);
        return null;
    }

    public Bar updateBar(Long id, Bar bar){
        Bar update = findBarById(id);
        update.setName(bar.getName());
        return this.repo.save(update);
    }

    public Boolean deleteBarById(Long id){
        if(!this.repo.existsById(id)){
            //throw new NoteNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}
