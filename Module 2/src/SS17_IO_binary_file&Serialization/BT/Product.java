package SS17.BT;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String madeIn;
    private int price;
    private String description;

    Product(int code, String name, String madeIn, int price, String description) {
        this.code = code;
        this.name = name;
        this.madeIn = madeIn;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return this.code + "||" + this.name + "||" + this.madeIn + "||" + this.price + "||" + this.description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDecription() {
        return description;
    }

    public void setDecription(String decription) {
        this.description = decription;
    }

}
