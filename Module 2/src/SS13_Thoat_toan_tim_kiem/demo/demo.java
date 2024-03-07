package SS13.demo;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n=Integer.parseInt(sc.nextLine());
        int[] numbers=new int[n];
        n= numbers.length;
        for (int i = 0; i<n; i++) {
            System.out.println("Nhap gia tri thu "+ i+" :");
            numbers[i]=sc.nextInt();
        }
//        int[] numbers = {6, 12, 14, 45, 543, 878, -1, 0, -5};
        System.out.println("Mời bạn nhập giá trị cần tìm: ");
        int x=sc.nextInt();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index=searchBinary(numbers,x);
        if(index !=1){
            System.out.println("Phan tu x o vi tri: "+index);
        } else{
            System.out.println("khong tim thay phan tu x");
        }

    }

    // TÌM KIẾM TUYẾN TÍNH
    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int lastLinearSearch(int[] a, int x) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index = i;
            }

        }
        return index;
    }

    // TÌM KIẾM NHỊ PHÂN
    public static int searchBinary(int[] numbers, int x) {
        int left = 0;
        int right = numbers.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (numbers[mid] == x) {
                return mid;
            } else if (numbers[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //TÌM KIẾM ĐỆ QUY NHỊ PHÂN
    public static int recursiveSearchBinary(int[] numbers, int x, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (numbers[mid] == x) {
                return mid;
            } else if (numbers[mid] < x) {
                //left=mid+1;
                return recursiveSearchBinary(numbers, x, mid + 1, right);
            } else {
                //right=mid-1;
                return recursiveSearchBinary(numbers, x, left, mid - 1);
            }
        } else {
            return -1;
        }
    }

}
