package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculateRepoImpl implements CalculateRepository{
    @Override
    public double addition(double number1, double number2) {
        return number1+number2;
    }

    @Override
    public double subtraction(double number1, double number2) {
        return number1-number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1*number2;
    }

    @Override
    public double division(double number1, double number2) {
        return number1/number2;
    }
}
