package org.example.repository;

import org.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepoImpl implements ProductRepo {
    private static List<Product> list;

    //    int code, String name, int quantity, String status, String description
    static {
        list = new ArrayList<>();
        list.add(new Product(123, "Cookie", 10, "còn", "ngon"));
        list.add(new Product(124, "Cokaa", 20, "còn", "ngon"));
        list.add(new Product(125, "Bánh quế", 8, "còn", "ngon"));
        list.add(new Product(126, "Rong biển Hàn Quốc", 9, "còn", "ngon"));
    }

    @Override
    public List<Product> getAll() {
        return list;
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public Product view(int id) {
        for (Product product:list
             ) {
            if(product.getCode()==id){
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ProductRepoImpl p=new ProductRepoImpl();
        System.out.println(p.view(123));
    }

    @Override
    public List<Product> edit(Product product) {
        for (Product p: list) {
            if(p.getCode() == product.getCode()) {
                list.set(list.indexOf(p),product);
            }
        }

        return getAll();
    }

    @Override
    public List<Product> delete(int id) {
        for (Product p: list) {
            if(p.getCode() == id) {
                 list.remove(list.indexOf(p));
                 return getAll();
            }
        }
        return null;
    }

    @Override
    public Product search(String search) {
        Product p=null;
        for (Product product:list
             ) {
            if(product.getName().equals(search)){
                return product;
            }
        }
        return null;
    }
}
