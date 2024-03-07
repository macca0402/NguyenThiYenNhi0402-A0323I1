package com.example.redemo_validate_springboot.service.impl;


import com.example.redemo_validate_springboot.entity.Category;
import com.example.redemo_validate_springboot.repository.CategoryRepository;
import com.example.redemo_validate_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public boolean create(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public boolean update(Category category) {
        categoryRepository.save(category);
        return true;
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> findAll() {
        return  categoryRepository.findAll();

    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
