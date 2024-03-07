package com.example.thi.entity;

import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "doanh_nghiep")
public class DoanhNghiep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tenDoanhNghiep;
    private String linhVucKD;
    private String soDienThoai;
    private String emailDN;
    private String diaChi;
    @OneToMany(mappedBy = "doanhNghiep")
    private List<DuAn> duAnList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public void setTenDoanhNghiep(String tenDoanhNghiep) {
        this.tenDoanhNghiep = tenDoanhNghiep;
    }

    public String getLinhVucKD() {
        return linhVucKD;
    }

    public void setLinhVucKD(String linhVucKD) {
        this.linhVucKD = linhVucKD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmailDN() {
        return emailDN;
    }

    public void setEmailDN(String emailDN) {
        this.emailDN = emailDN;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<DuAn> getDuAnList() {
        return duAnList;
    }

    public void setDuAnList(List<DuAn> duAnList) {
        this.duAnList = duAnList;
    }

    public DoanhNghiep(String tenDoanhNghiep, String linhVucKD, String soDienThoai, String emailDN, String diaChi, List<DuAn> duAnList) {
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.linhVucKD = linhVucKD;
        this.soDienThoai = soDienThoai;
        this.emailDN = emailDN;
        this.diaChi = diaChi;
        this.duAnList = duAnList;
    }

    public DoanhNghiep() {
    }

    public DoanhNghiep(int id, String tenDoanhNghiep, String linhVucKD, String soDienThoai, String emailDN, String diaChi, List<DuAn> duAnList) {
        this.id = id;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.linhVucKD = linhVucKD;
        this.soDienThoai = soDienThoai;
        this.emailDN = emailDN;
        this.diaChi = diaChi;
        this.duAnList = duAnList;
    }
}
