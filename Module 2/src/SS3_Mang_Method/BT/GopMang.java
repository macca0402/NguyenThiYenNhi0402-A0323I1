package SS3_Mang_Method.BT;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] mang1 = new int[n];
        int[] mang2 = new int[m];
        int[] mangGop = new int[n + m];
        nhap(mang1);
        xuat(mang1);
        nhap(mang2);
        xuat(mang2);
        for (int i = 0; i < n; i++) {
            mangGop[i] = mang1[i];
        }
        for (int i = n; i < mangGop.length; i++) {
            mangGop[i] = mang2[i - n];
        }
        xuat(mangGop);
    }

    public static void nhap(int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("\nNhap gia tri thu " + i);
            a[i] = sc.nextInt();
        }
    }

    public static void xuat(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
