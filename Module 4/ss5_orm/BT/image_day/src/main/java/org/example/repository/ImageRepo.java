package org.example.repository;

import org.example.entity.Image;
import java.util.List;
public interface ImageRepo {
    boolean createComment(Image image);
    List<Image> listImage();
     Image findComment(int id);
    void plus(Image image);
}
