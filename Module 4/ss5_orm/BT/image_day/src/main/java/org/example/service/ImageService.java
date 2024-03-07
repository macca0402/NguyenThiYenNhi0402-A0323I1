package org.example.service;

import org.example.entity.Image;

import java.util.List;

public interface ImageService {
    boolean createComment(Image image);
    List<Image> listImage();
    Image findComment(int id);
    void plus(Image image);
}
