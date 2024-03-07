package SS3_Mang_Method.BT;

import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Nhap vao gia tri phan tu can them");
        int newItem = sc.nextInt();
        System.out.println("Nhap vao vi tri muon them");
        int newIndex = sc.nextInt();
        int[] newArr = new int[arr.length +1];
        boolean check = false;
        for (int i =0; i<newArr.length; i++){
            if (newIndex == i){
                newArr[i]=newItem;
                check = true;
                continue;
            }
            if (check){
                newArr[i] = arr[i-1];
            }else {
                newArr[i] = arr[i];
            }

        }
        xuat(newArr);
    }
    public static void xuat(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
