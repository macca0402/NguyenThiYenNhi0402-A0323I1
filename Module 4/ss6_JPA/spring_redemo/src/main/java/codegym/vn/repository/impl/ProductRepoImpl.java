package codegym.vn.repository.impl;

import codegym.vn.entity.Product;
import codegym.vn.repository.CategoryRepository;
import codegym.vn.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepoImpl implements ProductRepository {
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
        return entityManager.createQuery("From Product").getResultList();
    }

    @Override
    public boolean deleteById(int id) {
        entityManager.remove(findById(id));
        return true;
    }
    public List<Product> findAllByName(String name){
        List<Product> productList=
                entityManager.createNamedQuery("findProductByName")
                        .setParameter("name","%"+name+"%")
                        .getResultList();
        return productList;
    }

}
