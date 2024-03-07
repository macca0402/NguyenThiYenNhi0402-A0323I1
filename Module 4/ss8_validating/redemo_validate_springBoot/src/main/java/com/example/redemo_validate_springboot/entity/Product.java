package com.example.redemo_validate_springboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 0,message = "ID phải là số nguyên dương")
    private int id;

    @NotBlank
    @Size(min=5,max=15,message = "{name.size}")
    private String name;
    @Min(1)
    private int quantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRealase;
    @NumberFormat(pattern = "#.##")

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
