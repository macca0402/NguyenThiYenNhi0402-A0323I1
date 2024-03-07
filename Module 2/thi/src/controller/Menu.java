package controller;

import jdk.swing.interop.SwingInterOpUtils;
import service.GiaoVienService;
import service.SinhVienService;

import java.util.Scanner;

public class Menu {
    private SinhVienService sinhVienService = new SinhVienService();
    private GiaoVienService giaoVienService = new GiaoVienService();
    private Scanner scanner = new Scanner(System.in);

    public void menuGiaoVien() {
        while(true){
            System.out.println("\t1.Them moi giao vien\n" +
                    "\t2.Xoa giao vien\n" +
                    "\t3.Xem danh sach giao vien\n" +
                    "\t4.Tim kiem giao vien\n" +
                    "\t5.Thoat\n" +
                    "\tChon chuc nang");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    giaoVienService.add();
                    break;
                case 2:
                    giaoVienService.delete();
                    break;
                case 3:
                    giaoVienService.display();
                    break;
                case 4:
                    giaoVienService.search();
                    break;
                case 5:
                    mucLuc();
                    break;
            }
        }


    }
        public void mucLuc() {
        while(true){
            System.out.println("====================================================");
            System.out.println("=========CHUONG TRINH QUAN LY SINH VIEN=============");
            System.out.println("\t1.Them moi sinh vien\n" +
                    "\t2.Xoa sinh vien\n" +
                    "\t3.Xem danh sach sinh vien\n" +
                    "\t4.Xem thong tin giao vien\n" +
                    "\t5.Tim kiem sinh vien\n" +
                    "\tChon chuc nang");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    sinhVienService.add();
                    break;
                case 2:
                    sinhVienService.delete();
                    break;
                case 3:
                    sinhVienService.display();
                    break;
                case 4:
                    menuGiaoVien();
                    break;
                case 5:
                    sinhVienService.search();
                    break;
                case 6:
                    break;
            }
        }
        }
    }

