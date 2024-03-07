package com.example.thi2.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "danh_muc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tenDoanhMuc;

    @OneToMany(mappedBy = "danhMuc")
    private List<TinTuc> tinTucList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDoanhMuc() {
        return tenDoanhMuc;
    }

    public void setTenDoanhMuc(String tenDoanhMuc) {
        this.tenDoanhMuc = tenDoanhMuc;
    }

    public List<TinTuc> getTinTucList() {
        return tinTucList;
    }

    public void setTinTucList(List<TinTuc> tinTucList) {
        this.tinTucList = tinTucList;
    }

    public DanhMuc(Integer id, String tenDoanhMuc, List<TinTuc> tinTucList) {
        this.id = id;
        this.tenDoanhMuc = tenDoanhMuc;
        this.tinTucList = tinTucList;
    }

    public DanhMuc() {
    }
}
