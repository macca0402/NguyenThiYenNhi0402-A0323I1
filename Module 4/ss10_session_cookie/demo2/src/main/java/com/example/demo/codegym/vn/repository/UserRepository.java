package com.example.demo.codegym.vn.repository;

import com.example.demo.codegym.vn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,String> {
}
