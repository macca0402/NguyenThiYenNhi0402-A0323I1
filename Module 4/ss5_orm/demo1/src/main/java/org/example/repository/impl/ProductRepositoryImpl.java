package org.example.repository.impl;

import org.example.entity.Product;
import org.example.repository.CategoryRepository;
import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {
    @Autowired
    CategoryRepository categoryRepository;

    public ProductRepositoryImpl() {
    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean create(Product product) {
         entityManager.persist(product);
         return true;
    }

    @Override
    public boolean update(Product product) {
        entityManager.merge(product);
        return true;
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class,id);

    }

    @Override
    public List<Product> findAll() {
       return entityManager.createQuery("From Product ").getResultList();
  }

    @Override
    public boolean deleteId(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
