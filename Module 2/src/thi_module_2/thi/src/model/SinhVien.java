package model;

public class SinhVien extends Nguoi{
    private String maLop;

    @Override
    public String toString() {
        return super.toString()+","+maLop;
    }

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLop) {
        super(ma, ten, ngaySinh, gioiTinh, soDienThoai);
        this.maLop = maLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
}
