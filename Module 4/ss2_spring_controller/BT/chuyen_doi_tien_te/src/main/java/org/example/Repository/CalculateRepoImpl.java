package org.example.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculateRepoImpl implements CalculateRepo{
    @Override
    public double USD(float value) {;
        return value/24000;
    }
    @Override
    public double VND(float value) {
        return value*24000;
    }
}
