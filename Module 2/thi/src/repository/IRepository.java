package repository;

import java.util.List;

public interface IRepository<E> {
    void add(E e);
    void delete(String e);
    void search(String e);
    List<E> getAll();
}
