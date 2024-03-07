package org.example.service;

import org.example.repository.CalculateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Autowired
    private CalculateRepository calculateRepository;

    @Override
    public double addition(double number1, double number2) {
        return calculateRepository.addition(number1,number2);
    }

    @Override
    public double subtraction(double number1, double number2) {
        return calculateRepository.subtraction(number1,number2);
    }

    @Override
    public double multiplication(double number1, double number2) {
        return calculateRepository.multiplication(number1,number2);
    }

    @Override
    public double division(double number1, double number2) {
        return calculateRepository.division(number1,number2);
    }
}
