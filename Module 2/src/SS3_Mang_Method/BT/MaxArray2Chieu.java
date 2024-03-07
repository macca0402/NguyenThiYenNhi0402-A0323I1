package SS3_Mang_Method.BT;

import java.util.Scanner;

public class MaxArray2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Nhap so dong: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so dong: ");
        m = Integer.parseInt(sc.nextLine());
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhap gia tri a[" + i + "][" + j + "]:");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
                ;
            }
            System.out.println("\n");
        }
        int max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max mang: " + max);
    }
}
