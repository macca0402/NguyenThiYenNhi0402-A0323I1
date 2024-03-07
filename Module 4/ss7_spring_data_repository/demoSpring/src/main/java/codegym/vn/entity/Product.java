package codegym.vn.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Table(name="product")
public class Product {
    @Id
    private int id;
    private String name;
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRealase;

    private  double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateRealase() {
        return dateRealase;
    }

    public void setDateRealase(Date dateRealase) {
        this.dateRealase = dateRealase;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(int id, String name, int quantity, Date dateRealase, double price, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dateRealase = dateRealase;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }
}
