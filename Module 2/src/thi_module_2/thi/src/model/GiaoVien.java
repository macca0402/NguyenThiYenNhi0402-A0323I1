package model;

public class GiaoVien extends Nguoi{
    @Override
    public String toString() {
        return super.toString();
    }

    public GiaoVien() {
    }

    public GiaoVien(String ma, String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(ma, ten, ngaySinh, gioiTinh, soDienThoai);
    }
}
