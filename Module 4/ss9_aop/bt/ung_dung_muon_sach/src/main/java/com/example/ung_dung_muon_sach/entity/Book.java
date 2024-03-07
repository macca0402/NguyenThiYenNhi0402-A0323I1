package com.example.ung_dung_muon_sach.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import java.util.List;
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;
    private String name;
    @Min(0)
    private int quantity;
    private String author;
    @OneToMany(mappedBy = "book" )
    private List<Borrow> codeBorrow;

    public List<Borrow> getCodeBorrow() {
        return codeBorrow;
    }

    public void setCodeBorrow(List<Borrow> codeBorrow) {
        this.codeBorrow = codeBorrow;
    }

    public Book(int id, String name, int quantity, String author, List<Borrow> codeBorrow) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
        this.codeBorrow = codeBorrow;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, int quantity, String author) {
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }



    public Book(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

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

    public Book(int id, String name, int quantity, String author) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }

    public Book() {
    }
}
