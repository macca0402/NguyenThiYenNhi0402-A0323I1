package SS10.demo.MVC.respository;

import java.util.List;

public interface IRepository<E>{
    void remove(int code);
    void add(E e);
    List<E> getAll();
}
