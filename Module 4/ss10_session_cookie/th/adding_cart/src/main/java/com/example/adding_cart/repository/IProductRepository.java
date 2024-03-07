package com.example.adding_cart.repository;

import com.example.adding_cart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
