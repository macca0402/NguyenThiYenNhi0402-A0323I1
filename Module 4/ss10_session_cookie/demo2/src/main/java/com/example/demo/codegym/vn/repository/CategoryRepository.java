package com.example.demo.codegym.vn.repository;


import com.example.demo.codegym.vn.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
