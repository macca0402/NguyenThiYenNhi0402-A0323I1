package codegym.vn.repository;

import codegym.vn.entity.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    public List<Product> findAllByName(String name);
}
