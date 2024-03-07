package com.example.thi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "du_an")
public class DuAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "khong trong")
    private String tenDuAn;

    @NotNull(message = "Không được để trống")

    private Float kinhPhi;
    @NotNull(message = "Không được để trống")
    @NotBlank(message = "khong trong")
    private String moTa;
    @NotNull(message = "khong duoc de trong")
    private Integer thoiGianDangKi;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayDangKi;

    @ManyToOne
    @JoinColumn(name = "doanh_nghiep_dang_ky")
    private DoanhNghiep doanhNghiep;
    private float chiPhi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public DoanhNghiep getDoanhNghiep() {
        return doanhNghiep;
    }

    public void setDoanhNghiep(DoanhNghiep doanhNghiep) {
        this.doanhNghiep = doanhNghiep;
    }

    public Float getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(float kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public @NotNull Integer getThoiGianDangKi() {
        return thoiGianDangKi;
    }

    public void setThoiGianDangKi(@NotNull Integer thoiGianDangKi) {
        this.thoiGianDangKi = thoiGianDangKi;
    }

    public Date getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(Date ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public float getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(float chiPhi) {
        this.chiPhi = chiPhi;
    }

    public DuAn(String tenDuAn, DoanhNghiep doanhNghiep, float kinhPhi, String moTa, int thoiGianDangKi, Date ngayDangKi, float chiPhi) {
        this.tenDuAn = tenDuAn;
        this.doanhNghiep = doanhNghiep;
        this.kinhPhi = kinhPhi;
        this.moTa = moTa;
        this.thoiGianDangKi = thoiGianDangKi;
        this.ngayDangKi = ngayDangKi;
        if(this.kinhPhi<100000000){
            chiPhi = (float) (getKinhPhi()*0.01 *getThoiGianDangKi());
        } else if (this.kinhPhi>100000000&&this.kinhPhi<500000000) {
            chiPhi = (float) (getKinhPhi()*0.02 *getThoiGianDangKi());
        } else if(this.kinhPhi>500000000){
            chiPhi= (float) (getKinhPhi()*0.03 *getThoiGianDangKi());
        }
        this.chiPhi=chiPhi;


    }

    public DuAn(int id, String tenDuAn, DoanhNghiep doanhNghiep, Float kinhPhi, String moTa, int thoiGianDangKi, Date ngayDangKi) {
        this.id = id;
        this.tenDuAn = tenDuAn;
        this.doanhNghiep = doanhNghiep;
        this.kinhPhi = kinhPhi;
        this.moTa = moTa;
        this.thoiGianDangKi = thoiGianDangKi;
        this.ngayDangKi = ngayDangKi;
    }

    public DuAn() {
    }
}
