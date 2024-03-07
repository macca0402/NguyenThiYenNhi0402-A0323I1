package SS3_Mang_Method.TH;

import java.util.Scanner;

public class DemSoSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so luong sinh vien:");
            n = Integer.parseInt(sc.nextLine());
        } while (n > 30);
        float[] arrayStudent = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + i);
            arrayStudent[i] = Float.parseFloat(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Diem thu sv thu " + i);
            System.out.println("   " + arrayStudent[i] + "\t");
        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (arrayStudent[i] >= 5 && arrayStudent[i] <= 10) {
                dem++;
            }
        }
        System.out.println("Tong so hoc sinh do: " + dem);
    }
}
