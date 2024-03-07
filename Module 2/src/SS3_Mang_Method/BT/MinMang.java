package SS3_Mang_Method.BT;

import java.util.Scanner;

public class MinMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Gia tri min cua mang: " + min);


    }
}
