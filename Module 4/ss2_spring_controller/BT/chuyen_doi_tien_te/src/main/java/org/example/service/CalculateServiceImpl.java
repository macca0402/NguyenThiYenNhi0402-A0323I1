package org.example.service;

import org.example.Repository.CalculateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Autowired
    private CalculateRepo calculateRepo;
    @Override
    public double USD(float value) {
        return calculateRepo.USD(value);
    }

    @Override
    public double VND(float value) {
        return calculateRepo.VND(value);
    }
}
