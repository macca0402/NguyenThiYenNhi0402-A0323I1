package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginService implements ILoginService{
    @Autowired
    private LoginRepo loginRepo;
    @Override
    public boolean create(Login login) {
        loginRepo.save(login);
        return true;
    }

    @Override
    public boolean delete(int id) {
        loginRepo.deleteById(id);
        return true;
    }

    @Override
    public Login findById(int id) {
        return loginRepo.findById(id).orElse(null);
    }

    @Override
    public List<Login> findAll() {
        return loginRepo.findAll();
    }
}
