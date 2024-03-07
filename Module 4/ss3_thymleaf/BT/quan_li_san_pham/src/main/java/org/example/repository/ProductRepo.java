package org.example.repository;

import org.example.model.Product;
import java.util.List;
public interface ProductRepo {
    List<Product> getAll();
    void add(Product product);
     Product view(int id);
     List<Product> edit(Product p);
     List<Product> delete(int id);
     Product search(String search);
}
