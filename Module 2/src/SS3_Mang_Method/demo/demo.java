package SS3_Mang_Method.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        demo demo= new demo();
        int num1=demo.inputNumber();
        int num2=demo.inputNumber();
        demo.add(num1,num2);
    }
    public int inputNumber(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Moi ban nhap so: ");
        int num=Integer.parseInt(scanner.nextLine());
        return num;
    }
    public void add(int num1,int num2){
        int result=num1+num2;
        System.out.println("Ket qua cua phep cong: "+ result);
    }
}
