package com.example.case_4.entity;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "loai_khach")
public class CustomerCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ma_loai_khach;
    private String ten_loai_khach;
    @OneToMany(mappedBy = "category")
    private List<Customer> list;

    public int getMa_loai_khach() {
        return ma_loai_khach;
    }

    public void setMa_loai_khach(int ma_loai_khach) {
        this.ma_loai_khach = ma_loai_khach;
    }

    public String getTen_loai_khach() {
        return ten_loai_khach;
    }

    public void setTen_loai_khach(String ten_loai_khach) {
        this.ten_loai_khach = ten_loai_khach;
    }

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }

    public CustomerCategory() {
    }

    public CustomerCategory(String ten_loai_khach) {
        this.ten_loai_khach = ten_loai_khach;
    }
}
