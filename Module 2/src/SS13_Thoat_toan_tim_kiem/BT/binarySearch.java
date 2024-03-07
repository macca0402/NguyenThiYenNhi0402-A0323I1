package SS13.BT;

import java.sql.Array;
import java.util.Scanner;

public class binarySearch {
    static void nhapMang(int[] array, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri " + i + " : ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
    }

    static void inMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int binarySearch(int[] list, int key, int left, int right) {
        int low = left;
        int high = right;


        int mid = (low + high) / 2;
        if (low < right) {
            if (key < list[mid]) {
                return binarySearch(list, key, low, mid);
            } else if (key > list[mid]) {
                return binarySearch(list, key, mid, high);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] array = new int[n];
        nhapMang(array, n);
        inMang(array);
//        System.out.println(binarySearch(array,1,0,array.length-1));
        System.out.println();
        System.out.println("so can tim nam o vi tri: " + binarySearch(array, 5, 0, array.length - 1));
//        System.out.println(  binarySearch(array,11,0,array.length-1));


    }
}
