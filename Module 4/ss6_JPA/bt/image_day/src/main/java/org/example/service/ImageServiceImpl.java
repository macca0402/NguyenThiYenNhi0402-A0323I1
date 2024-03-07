package org.example.service;

import org.example.entity.Image;
import org.example.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepo imageRepo;

    @Override
    public boolean createComment(Image image) {
        imageRepo.save(image);
        return true;
    }

    @Override
    public List<Image> listImage() {
        return imageRepo.findAll();
    }

    @Override
    public Image findComment(int id) {
        return imageRepo.findById(id).orElse(null);
    }

    @Override
    public void plus(Image image) {
        image.setTim(image.getTim() + 1);
        imageRepo.save(image);
    }
}
