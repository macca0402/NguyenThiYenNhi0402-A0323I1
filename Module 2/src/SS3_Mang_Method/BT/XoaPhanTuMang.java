package SS3_Mang_Method.BT;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int n;
        System.out.println("Nhap so luong: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nNhap gia tri can xoa: ");
        int value = sc.nextInt();
        if (timKiem(arr, n, value) == -1) {
            System.out.println("Khong tim thay gia tri.");
        } else {
            xoaMang(arr, n, timKiem(arr, n, value));
        }
        System.out.println("Mang sau xoa:");
        n = xoaMang(arr, n, value);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    public static int xoaMang(int a[], int n, int vt) {
        for (int i = vt; i < n; i++) {
            a[i] = a[i + 1];
        }
        return n - 1;
    }

    public static int timKiem(int a[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
