package repository;

import model.GiaoVien;
import util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoVienRepository implements IRepoGiaoVien{
    private static final String SRC_GIAOVIEN="G:\\CODEGYM\\MODULE2\\thi\\src\\data\\data";
    private Scanner scanner= new Scanner(System.in);
    private ReadWriteFile readWriteFile=new ReadWriteFile();
    @Override
    public void add(GiaoVien giaoVien) {
        readWriteFile.writeFileObject(SRC_GIAOVIEN,giaoVien,true);
    }

    @Override
    public void delete(String e) {
        List<GiaoVien> giaoVienList = getAll();
        for (GiaoVien giaoVien : giaoVienList) {
            if (giaoVien.getMa().equals(e)) {
                System.out.println("\tBan co chac muon xoa: \n" +
                        "\t1.Xoa\n" +
                        "\t2.Huy bo\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        giaoVienList.remove(giaoVien);
                        break;
                    case 2:
                        break;
                }
                break;
            }
        }
        readWriteFile.writeFileGiaoVien(SRC_GIAOVIEN,giaoVienList,false);
    }

    @Override
    public void search(String e) {
        List<GiaoVien> giaoVienList = getAll();
        GiaoVien temp = new GiaoVien();
        boolean flag = false;
        for (GiaoVien giaoVien : giaoVienList) {
            if (giaoVien.getTen().equals(e)) {
                temp = giaoVien;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Thong tin cua "+ e+"la: ");
            System.out.println(temp.toString());
        } else {
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public List<GiaoVien> getAll() {
        List<GiaoVien> lists = new ArrayList<>();
        List<String> strings = readWriteFile.readFile(SRC_GIAOVIEN);
        for (String str : strings) {
            String[] temp = str.split(",");
            if(temp.length==5) {
                lists.add(new GiaoVien(temp[0], temp[1], temp[2], temp[3], temp[4]));
            }
        }
        return lists;
    }
}
