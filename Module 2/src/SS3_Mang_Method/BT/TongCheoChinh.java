package SS3_Mang_Method.BT;

import java.util.Scanner;

public class TongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap do dai ma tran vuong: ");
        n = Integer.parseInt(sc.nextLine());
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap gia tri a[" + i + "][" + j + "]:");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
                ;
            }
            System.out.println("\n");
        }
        int tongCheoChinh=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    tongCheoChinh=tongCheoChinh+array[i][j];
                }
            }
        }
        System.out.println("Tong cheo chinh: "+ tongCheoChinh);
    }
}
