package org.example.repository;

import org.example.entity.Image;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ImageRepoImpl implements ImageRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean createComment(Image image) {
        entityManager.persist(image);
        return true;
    }

    @Override
    public List<Image> listImage() {
        return entityManager.createQuery("From Image ").getResultList();
    }

    @Override
    public Image findComment(int id) {
        return entityManager.find((Image.class),id);
    }


    @Override
    public void plus(Image image) {
        image.setTim(image.getTim()+1);
        entityManager.merge(image);

    }
}
