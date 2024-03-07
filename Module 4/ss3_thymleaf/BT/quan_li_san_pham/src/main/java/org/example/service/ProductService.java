package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<Product> getAll();
    void add(Product product);
    Product view(int id);
    List<Product> edit(Product p);
    List<Product> delete(int id);
    Product search(String search);

}
