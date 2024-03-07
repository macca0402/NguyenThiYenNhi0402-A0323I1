package org.example.service;

import org.example.entity.Image;

import java.util.List;

public interface Service<T> {
    boolean createComment(T t);
    List<T> listImage();
    Image findComment(int id);
    void plus(T t);
}
