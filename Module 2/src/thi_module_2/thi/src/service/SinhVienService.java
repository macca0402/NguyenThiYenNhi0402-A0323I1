package service;

import Validate.ValidateDateOfBirth;
import Validate.ValidateNumberPhone;
import model.SinhVien;
import repository.SinhVienRepository;

import java.util.List;
import java.util.Scanner;

public class SinhVienService implements IServiceSinhVien{
    private SinhVienRepository sinhVienRepository=new SinhVienRepository();
    private Scanner scanner= new Scanner(System.in);
    ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();
    ValidateDateOfBirth validateDateOfBirth= new ValidateDateOfBirth();
    public SinhVien nhap(){
        SinhVien sinhVien=new SinhVien();
        System.out.println("Nhap ma: ");
        sinhVien.setMa(scanner.nextLine());
        System.out.println("Nhap ten: ");
        sinhVien.setTen(scanner.nextLine());
       System.out.println("Nhap ngay sinh: ");
        sinhVien.setNgaySinh(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        sinhVien.setGioiTinh(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        sinhVien.setSoDienThoai(scanner.nextLine());
        System.out.println("Ma lop hoc: ");
        sinhVien.setMaLop(scanner.nextLine());
        return sinhVien;
    }

    @Override
    public void add() {
        SinhVien sinhVien=nhap();
        sinhVienRepository.add(sinhVien);
        System.out.println("Them thanh cong ");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma can xoa: ");
        String id=scanner.nextLine();
        sinhVienRepository.delete(id);
    }

    @Override
    public void search() {
        System.out.println("Nhap ten can tim : ");
        String name=scanner.nextLine();
        sinhVienRepository.search(name);
    }

    @Override
    public void display() {
        List<SinhVien> sinhVienList = sinhVienRepository.getAll();
        for (SinhVien sinhVien : sinhVienList) {
            System.out.println(sinhVien);
        }
    }

    public static void main(String[] args) {
        SinhVienService sinhVienService=new SinhVienService();
        sinhVienService.nhap();
    }
}
