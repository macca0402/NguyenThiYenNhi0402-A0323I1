package SS1_introduction_to_java.BT;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello : " + name);
    }
}
