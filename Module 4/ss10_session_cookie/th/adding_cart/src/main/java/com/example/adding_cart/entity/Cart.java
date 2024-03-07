package com.example.adding_cart.entity;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.HashMap;
import java.util.Map;

@Component
public class Cart {
    private Map<Product, Integer> listProduct = new HashMap<>();
    public void deleteItems(int key){
        for(Map.Entry<Product,Integer> entry:listProduct.entrySet()){
            if(entry.getKey().getId()==key){
                listProduct.remove(entry.getKey(),entry.getValue());
                break;
            }
        }
    }

    public boolean checkItems(Product product) {
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            if (entry.getKey().getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    public Map.Entry<Product, Integer> selectItems(Product product) {
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            if (entry.getKey().getId() == product.getId()) {
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItems(product)) {
            listProduct.put(product, 1);
        } else {
            Map.Entry<Product, Integer> entry = selectItems(product);
            entry.setValue(entry.getValue() + 1);
        }
    }

    public int countItems() {
        return listProduct.size();
    }

    public int totalPayment() {
        int totalPayment = 0;
        for (Map.Entry<Product, Integer> entry : listProduct.entrySet()) {
            totalPayment = totalPayment + (entry.getKey().getPrice() * entry.getValue());
        }
        return totalPayment;
    }


    public Cart(Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    public Map<Product, Integer> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Map<Product, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    public Cart() {
    }
}
