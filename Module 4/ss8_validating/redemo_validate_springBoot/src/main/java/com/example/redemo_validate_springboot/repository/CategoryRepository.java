package com.example.redemo_validate_springboot.repository;


import com.example.redemo_validate_springboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
