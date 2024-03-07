package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServcieImpl implements ProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getAll() {
        return productRepo.getAll();
    }

    @Override
    public void add(Product product) {
        productRepo.add(product);
    }

    @Override
    public Product view(int id) {
        return productRepo.view(id);
    }

    @Override
    public List<Product> edit(Product p) {
        return productRepo.edit(p);
    }

    @Override
    public List<Product> delete(int id) {
        return productRepo.delete(id);
    }

    @Override
    public Product search(String search) {
        return productRepo.search(search);
    }
}
