package repository;

import model.SinhVien;
import util.ReadWriteFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SinhVienRepository implements IRepoSinhVien {
    private static final String SRC_SINHVIEN="C:\\thi\\src\\data\\SinhVien";
    private Scanner scanner= new Scanner(System.in);
    private ReadWriteFile readWriteFile=new ReadWriteFile();
    @Override
    public void add(SinhVien sinhVien) {
        readWriteFile.writeFileObject(SRC_SINHVIEN,sinhVien,true);
    }

    @Override
    public void delete(String e) {
        List<SinhVien> sinhVienList = getAll();
        for (SinhVien sinhVien : sinhVienList) {
            if (sinhVien.getMa().equals(e)) {
                System.out.println("\tBan co chac muon xoa: \n" +
                        "\t1.Xoa\n" +
                        "\t2.Huy bo\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        sinhVienList.remove(sinhVien);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        readWriteFile.writeFileSinhVien(SRC_SINHVIEN,sinhVienList, false);
    }

    @Override
    public void search(String name) {
        List<SinhVien> sinhVienList = getAll();
        SinhVien temp = new SinhVien();
        boolean flag = false;
        for (SinhVien sinhVien : sinhVienList) {
            if (sinhVien.getTen().equals(name)) {
                temp = sinhVien;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Thong tin cua "+ name +"la: ");
            System.out.println(temp.toString());
        } else  {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public List<SinhVien> getAll() {
        List<SinhVien> lists = new ArrayList<>();
        List<String> strings = readWriteFile.readFile(SRC_SINHVIEN);
        for (String str : strings) {
            String[] temp = str.split(",");
            lists.add(new SinhVien(temp[0], temp[1], temp[2], temp[3],temp[4],temp[5]));
        }
        return lists;
    }
}
