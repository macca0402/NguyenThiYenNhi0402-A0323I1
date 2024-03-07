package codegym.vn.repository.impl;

import codegym.vn.entity.Category;
import codegym.vn.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {
//    public static Map<Integer, Category> categoryMap;
//    static {
//        categoryMap = new HashMap<>();
//        categoryMap.put(1, new Category(1, "Laptop"));
//        categoryMap.put(2, new Category(2, "Smartphone"));
//        categoryMap.put(3, new Category(3, "Tivi"));
//        categoryMap.put(4, new Category(4, "Tu lanh"));
//    }

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public boolean create(Category category) {
        entityManager.persist(category);
        return true;
    }

    @Override
    public boolean update(Category category) {
        entityManager.merge(category);
        return true;
    }
    @Override
    public Category findById(int id) {
        return entityManager.find(Category.class, id);
    }
    @Override
    public List<Category> findAll() {
        return entityManager.createQuery("From Category").getResultList();
    }
    @Override
    public boolean deleteById(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
