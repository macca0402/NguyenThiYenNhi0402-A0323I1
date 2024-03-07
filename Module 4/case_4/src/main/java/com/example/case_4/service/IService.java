package com.example.case_4.service;

import java.util.List;

public interface IService<T>{
    boolean create(T t);
    boolean update(T t);
    T findById(int id);
    List<T> findAll();
    boolean deleteById(int id);
}
