package ss2_array_loop.TH;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int num = Integer.parseInt(sc.nextLine());
        boolean check;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is not a prime");
            }
        }
    }
}
