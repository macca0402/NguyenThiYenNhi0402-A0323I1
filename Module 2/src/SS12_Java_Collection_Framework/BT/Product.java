package SS12.BT;

import java.util.Date;

public class Product {
    private String nameProduct;
    private String date;
    private int id;
    private Float price;
    public Product(String nameProduct,String date, int id,Float price) {
        this.nameProduct = nameProduct;
        this.date = date;
        this.id = id;
        this.price=price;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "ID: "+ this.id+"|| San pham : "+ this.nameProduct+"|| Ngay san xuat: "+this.date+"|| Gia : "+this.price;
    }
}
