package com.example.thi2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "tin_tuc")
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được để trống")
    @Size(min=0,max = 50,message = "Tiêu đề không quá 50 ky tu")
    private String tieuDe;
    @ManyToOne
    @JoinColumn(name = "danh_muc")
    private DanhMuc danhMuc;
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được để trống")
    @Size(min=0,max=500,message = "Nội dung không quá 500 ky tu")
    private String noiDung;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayDang;
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "Không được để trống")
    private String phongVien;

    public TinTuc(String tieuDe, DanhMuc danhMuc, String noiDung, Date ngayDang, String phongVien) {
        this.tieuDe = tieuDe;
        this.danhMuc = danhMuc;
        this.noiDung = noiDung;
        this.ngayDang = ngayDang;
        this.phongVien = phongVien;
    }

    public TinTuc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(Date ngayDang) {
        this.ngayDang = ngayDang;
    }

    public String getPhongVien() {
        return phongVien;
    }

    public void setPhongVien(String phongVien) {
        this.phongVien = phongVien;
    }
}
