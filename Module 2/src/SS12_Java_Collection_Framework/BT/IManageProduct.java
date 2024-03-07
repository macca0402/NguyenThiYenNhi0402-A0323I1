package SS12.BT;

import java.util.List;

public interface IManageProduct extends IManage<Product>{
    void addProduct();
    void editProduct(int id);
    void deleteProduct(int id);
    void searchNameProduct();
    void sortAscending(Product product);
    void sortDescending(Product product);
    void displayAll();

    List<Product> getAll();
}
