package SS12.BT;

import java.util.List;

public interface IManage<E> {
    void addProduct();
    void editProduct(int id);
    void deleteProduct(int id);
    void searchNameProduct();
    void sortAscending(E e);
    void sortDescending(E e);
    void displayAll();
    List<E> getAll();
}
