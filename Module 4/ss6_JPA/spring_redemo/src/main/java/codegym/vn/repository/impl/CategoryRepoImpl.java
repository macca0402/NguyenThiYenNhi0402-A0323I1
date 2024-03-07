package codegym.vn.repository.impl;
import codegym.vn.entity.Category;
import codegym.vn.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CategoryRepoImpl implements CategoryRepository {

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
       return entityManager.find(Category.class,id);
    }
    @Override
    public List<Category> findAll() {
        return entityManager.createQuery("From Category ").getResultList();
    }
    @Override
    public boolean deleteById(int id) {
        entityManager.remove(findById(id));
        return true;
    }
}
