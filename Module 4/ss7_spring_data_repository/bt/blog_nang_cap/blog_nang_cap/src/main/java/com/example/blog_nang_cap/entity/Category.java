package com.example.blog_nang_cap.entity;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "category_id")
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Blog> blogList;

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

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    public Category(String name, List<Blog> blogList) {
        this.name = name;
        this.blogList = blogList;
    }

}
