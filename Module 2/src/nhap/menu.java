package nhap;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Menu có: ");
        System.out.println("1.Nước ép ");
        System.out.println("2.Nước ép ");
        System.out.println("3.Nước ép ");
        int choice=Integer.parseInt(scanner.nextLine());
        do{
            System.out.println("Moi ban nhap lai : ");
            choice=Integer.parseInt(scanner.nextLine());
        } while ( choice <1 || choice>4);
    }
}
