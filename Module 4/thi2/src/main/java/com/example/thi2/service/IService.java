package com.example.thi2.service;

import com.example.thi2.entity.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService<T>{
    List<T> findAllByName(String name);
    public List<T> findAllByDanhMuc(String name);
    boolean create(T t);
    boolean update(T t);
    T findById(int id);

    List<T> findAll();
    boolean deleteById(int id);


}
