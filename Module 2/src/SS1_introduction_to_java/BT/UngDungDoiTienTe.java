package SS1_introduction_to_java.BT;

import java.util.Scanner;

public class UngDungDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so usd: ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Gia tri VND: " + quyDoi);

    }
}
