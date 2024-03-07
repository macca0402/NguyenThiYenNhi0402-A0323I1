package SS3_Mang_Method.BT;

import java.util.Scanner;

public class TongCotCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Nhap so dong: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot: ");
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
        System.out.println("Nhap cot can tinh: ");
        int cot = Integer.parseInt(sc.nextLine());
        int tongCot = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == cot) {
                    tongCot = tongCot + array[i][j];
                }
            }
        }
        System.out.println("Tong cot : " + tongCot);

    }
}
