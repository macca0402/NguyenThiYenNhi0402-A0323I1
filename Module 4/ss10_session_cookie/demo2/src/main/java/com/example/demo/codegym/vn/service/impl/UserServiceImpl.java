package com.example.demo.codegym.vn.service.impl;

import com.example.demo.codegym.vn.entity.User;
import com.example.demo.codegym.vn.repository.UserRepository;
import com.example.demo.codegym.vn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUserName(String username) {
        return userRepository.findById(username).orElse(null);
    }
}
