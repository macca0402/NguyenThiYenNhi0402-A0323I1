package org.example.service;

import org.example.entity.Sandwich;
import org.example.repository.SandwichRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService implements SandwichIService{
    @Autowired
    private SandwichRepo sandwichRepo;

    @Override
    public List<Sandwich> findAll() {
        return sandwichRepo.findAll();
    }
}
