package codegym.vn.repository;

import codegym.vn.entity.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogRepoImpl implements BlogRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        return entityManager.createQuery("From Blog ", Blog.class).getResultList();
    }

    @Override
    public Blog findById(int id) {
        return entityManager.find(Blog.class, id);
    }

    @Override
    public void save(Blog blog) {
        if (null != String.valueOf(blog.getId()) ) {
            entityManager.merge(blog);
        } else {
            entityManager.persist(blog);
        }
    }


    @Override
    public void remove(int blogId) {
        entityManager.remove(findById(blogId));
    }
}
