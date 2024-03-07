package com.example.redemo_validate_springboot.service.impl;


import com.example.redemo_validate_springboot.entity.Product;
import com.example.redemo_validate_springboot.repository.ProductRepository;
import com.example.redemo_validate_springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;
    @Override
    public List<Product> findAllByName(String name) {
        return repository.findAllByNameContaining(name);
    }

    @Override
    public Page<Product> findAllAndPaging(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Slice<Product> findAllSlice(Pageable pageable) {
        return repository.findAll(pageable);
    }


    @Override
    public boolean create(Product product) {
        repository.save(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        repository.save(product);
        return true;
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        repository.deleteById(id);
        return true;
    }
}
