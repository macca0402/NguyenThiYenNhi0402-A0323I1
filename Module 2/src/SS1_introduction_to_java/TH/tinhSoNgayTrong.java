package SS1_introduction_to_java.TH;

import java.util.Scanner;

public class tinhSoNgayTrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
        do {
            System.out.println("Nhap thang can tinh: ");
            thang = sc.nextInt();
        } while (thang > 13 && thang < 0);
        switch (thang) {
            case 2:
                System.out.println(" tháng 2 có thể có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            default:
                System.out.println("Thang co 30 ngay:");
        }
    }
}
