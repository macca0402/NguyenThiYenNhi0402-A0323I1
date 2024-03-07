package com.example.adding_cart.service.impl;

import com.example.adding_cart.entity.Product;

import com.example.adding_cart.repository.IProductRepository;
import com.example.adding_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public boolean create(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    public boolean deleteById(int id) {
        productRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
