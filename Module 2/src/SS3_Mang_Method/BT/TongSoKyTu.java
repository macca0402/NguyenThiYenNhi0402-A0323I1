package SS3_Mang_Method.BT;

import java.util.Scanner;

public class TongSoKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = sc.nextLine();

        char s1[] = chuoi.toCharArray();
        System.out.println("Mang chuoi: ");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(s1[i] + "\t");
        }
        System.out.println("\nNhap ki tu can dem: ");
        char kyTu = sc.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == s1[i]) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien: " + dem);
    }
}
