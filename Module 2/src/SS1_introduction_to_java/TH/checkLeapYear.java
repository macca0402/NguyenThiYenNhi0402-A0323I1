package SS1_introduction_to_java.TH;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap nam: ");
        nam = Integer.parseInt(sc.nextLine());
        checkLeapYear bt = new checkLeapYear();
        bt.checkLeapYear(nam);
    }

    public boolean checkLeap(int nam) {
        if (nam % 4 == 0 && nam % 100 != 0) {
            return true;
        }
        if (nam % 100 == 0 && nam % 400 != 0) {
            return false;
        }
        if (nam % 100 == 0 & nam % 400 == 0) {
            return true;
        }
        return false;
    }

    public void checkLeapYear(int nam) {
        if (checkLeap(nam)) {
            System.out.println(nam + " la nam nhuan");
        } else {
            System.out.println(nam + " khong phai la nam nhuan");
        }
    }
}
