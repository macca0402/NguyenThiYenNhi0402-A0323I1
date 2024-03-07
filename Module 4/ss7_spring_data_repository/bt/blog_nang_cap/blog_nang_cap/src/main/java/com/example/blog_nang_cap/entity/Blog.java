package com.example.blog_nang_cap.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "blog")

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String author;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreate;

    public Blog(String author, String title, String content, Category category, Date dateCreate) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.category = category;
        this.dateCreate = dateCreate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blog(String author, String title, String content, Category category) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
