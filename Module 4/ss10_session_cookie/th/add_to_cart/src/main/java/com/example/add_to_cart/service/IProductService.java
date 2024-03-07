package com.example.add_to_cart.service;

import com.example.add_to_cart.entity.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
