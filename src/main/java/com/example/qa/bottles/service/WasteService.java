package com.example.qa.bottles.service;

import com.example.qa.bottles.domain.Waste;
import com.example.qa.bottles.exceptions.WasteNotFoundException;
import com.example.qa.bottles.repo.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteService {

    private final WasteRepository repo;

    @Autowired
    public WasteService(WasteRepository repo) {
        this.repo = repo;
    }

    public List<Waste> readAllWastes(){
        return this.repo.findAll();
    }

    public Waste createWaste(Waste waste){
        return this.repo.save(waste);
    }

    public Waste findWasteById(Long id){
        return this.repo.findById(id).orElseThrow(WasteNotFoundException::new);
    }

    public Waste updateWaste(Long id, Waste waste) throws Throwable {
        Waste update = findWasteById(id);
        update.setTotalWaste(waste.getTotalWaste());
        return this.repo.save(update);
    }

    public Boolean deleteWasteById(Long id){
        if(!this.repo.existsById(id)){
            throw new WasteNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}
