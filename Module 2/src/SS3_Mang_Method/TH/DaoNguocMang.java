package SS3_Mang_Method.TH;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] mang = new int[size];
        // nhap gia tri tung pt cua mang
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Gia tri thu " + i + " cua mang: ");
            mang[i] = Integer.parseInt(sc.nextLine());
        }
        // xuat mang
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "   ");
        }
        //dao nguoc mang
        int dau = 0;
        int cuoi = mang.length - 1;
        while (dau < cuoi) {
            int tam = mang[dau];
            mang[dau] = mang[cuoi];
            mang[cuoi] = tam;
            dau++;
            cuoi--;
        }
        // xuat mang
        System.out.println("\nMang sau khi dao nguoc: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + "\t");
        }


    }

}
