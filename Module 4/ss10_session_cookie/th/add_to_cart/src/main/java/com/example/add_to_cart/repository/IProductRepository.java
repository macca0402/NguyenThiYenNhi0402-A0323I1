package com.example.add_to_cart.repository;

import com.example.add_to_cart.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Long> {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
