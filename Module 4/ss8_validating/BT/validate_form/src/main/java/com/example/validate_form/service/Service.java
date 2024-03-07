package com.example.validate_form.service;
import java.util.List;
public interface Service<T>{
    boolean create (T t);
    T findById(int id);
    List<T> findAll();
}
