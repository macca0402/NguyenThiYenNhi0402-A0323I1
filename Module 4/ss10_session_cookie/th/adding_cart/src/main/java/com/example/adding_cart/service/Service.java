package com.example.adding_cart.service;
import java.util.List;
public interface Service<T> {
    boolean create(T t);
    boolean deleteById(int id);
    List<T> findAll();
    T findById(int id);
}
