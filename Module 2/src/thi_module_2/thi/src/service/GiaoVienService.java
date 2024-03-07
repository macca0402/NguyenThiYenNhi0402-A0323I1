package service;

import model.GiaoVien;
import model.SinhVien;
import repository.GiaoVienRepository;
import repository.SinhVienRepository;

import java.util.List;
import java.util.Scanner;

public class GiaoVienService implements IServiceGiaoVien {
    private GiaoVienRepository giaoVienRepository = new GiaoVienRepository();
    private Scanner scanner = new Scanner(System.in);

    public GiaoVien nhap() {
        GiaoVien giaoVien = new GiaoVien();
        System.out.println("Nhap ma: ");
        giaoVien.setMa(scanner.nextLine());
        System.out.println("Nhap ten: ");
        giaoVien.setTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        giaoVien.setNgaySinh(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        giaoVien.setGioiTinh(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        giaoVien.setSoDienThoai(scanner.nextLine());
        return giaoVien;
    }

    @Override
    public void add() {
        GiaoVien giaoVien = nhap();
        giaoVienRepository.add(giaoVien);
        System.out.println("Them thanh cong ");
        System.out.println("-------------------------------------------");
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma can xoa: ");
        String id = scanner.nextLine();
        giaoVienRepository.delete(id);
    }

    @Override
    public void search() {
        System.out.println("Nhap ten can tim : ");
        String ten = scanner.nextLine();
        giaoVienRepository.search(ten);
    }

    @Override
    public void display() {
        List<GiaoVien> giaoVienList = giaoVienRepository.getAll();
        for (GiaoVien giaoVien : giaoVienList) {
            System.out.println(giaoVien);
        }
    }
}
