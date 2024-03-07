package org.example.repository;
import java.util.List;
public interface Repository<T> {
    boolean create(T t);

    boolean update(T t);
    T findById(int id);
    List<T> findAll();
    boolean deleteId(int id);
}
