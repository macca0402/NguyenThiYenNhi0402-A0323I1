package com.example.validate_form.service;

import com.example.validate_form.entity.User;
import com.example.validate_form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean create(User user) {
       userRepository.save(user);
        return true;
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
