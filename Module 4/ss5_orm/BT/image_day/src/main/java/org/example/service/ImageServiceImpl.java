package org.example.service;

import org.example.entity.Image;
import org.example.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImageServiceImpl implements ImageService{
    @Autowired
    private ImageRepo imageRepo;
    @Override
    public boolean createComment(Image image) {
        return imageRepo.createComment(image);
    }

    @Override
    public List<Image> listImage() {
        return imageRepo.listImage();
    }

    @Override
    public Image findComment(int id) {
        return imageRepo.findComment(id);
    }

    @Override
    public void plus(Image image) {
         imageRepo.plus(image);
    }
}
