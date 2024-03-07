package codegym.vn.repository.impl;

import codegym.vn.entity.Product;
import codegym.vn.repository.CategoryRepository;
import codegym.vn.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        return entityManager.createQuery("From Product ").getResultList();
    }

    @Override
    public boolean deleteById(int id) {
        entityManager.remove(findById(id));
        return true;
    }

    @Override
    public List<Product> findAllByName(String name) {

        // Truyền param vào theo tên của param
//        List<Product> products =
//                entityManager.createQuery("From Product  p " +
//                        "where p.name like :name")
//                        .setParameter("name", "%" + name + "%")
//                        .getResultList();
        // Truyền param vào theo vị trí của param
//        List<Product> products =
//                entityManager.createQuery("From Product  p " +
//                                "where p.name like ?1")
//                        .setParameter(1, "%" + name + "%")
//                        .getResultList();

        // Sử dụng câu query tĩnh
        List<Product> products =
                entityManager.createNamedQuery("findProductByName")
                        .setParameter("name", "%" + name + "%")
                        .getResultList();
        return products;
    }
}
