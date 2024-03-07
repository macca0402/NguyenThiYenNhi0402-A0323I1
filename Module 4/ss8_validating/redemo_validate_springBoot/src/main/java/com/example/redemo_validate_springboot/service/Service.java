package com.example.redemo_validate_springboot.service;
import java.util.List;
public interface Service<T>{
    boolean create(T t);
    boolean update(T t);
    T findById(int id);
    List<T> findAll();
    boolean deleteById(int id);

}
