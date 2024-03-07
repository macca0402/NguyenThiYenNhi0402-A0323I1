package ss2_array_loop;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
       // int[] numbers = new int[5];
        int numbers[] ={1,2,3,4,5};
//        int[] numbers1=numbers;
//        numbers[1]=5;
//        System.out.println(Arrays.toString(numbers1));
//        System.out.println(Arrays.toString(numbers));
        for(int temp : numbers){
            temp += 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
