package com.example.case_4.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.BitSet;
import java.util.Date;

@Entity
@Table(name = "khach_hang")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ma_khach_hang;
    @ManyToOne
    @JoinColumn(name = "ma_loai_khach")
    private CustomerCategory category;
    private String ho_ten;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngay_sinh;
    private String gioi_tinh;
    private String so_cmnd;
    private String so_dien_thoai;
    private String email;
    private String dia_chi;

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public CustomerCategory getCategory() {
        return category;
    }

    public void setCategory(CustomerCategory category) {
        this.category = category;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getSo_cmnd() {
        return so_cmnd;
    }

    public void setSo_cmnd(String so_cmnd) {
        this.so_cmnd = so_cmnd;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public Customer() {
    }

    public Customer(CustomerCategory category, String ho_ten, Date ngay_sinh, String gioi_tinh, String so_cmnd, String so_dien_thoai, String email, String dia_chi) {
        this.category = category;
        this.ho_ten = ho_ten;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.so_cmnd = so_cmnd;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.dia_chi = dia_chi;
    }
}
