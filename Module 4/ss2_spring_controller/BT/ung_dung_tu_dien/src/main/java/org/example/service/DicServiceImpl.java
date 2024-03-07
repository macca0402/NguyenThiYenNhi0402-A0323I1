package org.example.service;

import org.example.repository.DicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DicServiceImpl implements DicService{
    @Autowired
    DicRepo dicRepo;
    @Override
    public String result(String key) {
        return dicRepo.result(key);
    }
}
