package codegym.vn.service;

import codegym.vn.entity.Product;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findAllByName(String name);
}
