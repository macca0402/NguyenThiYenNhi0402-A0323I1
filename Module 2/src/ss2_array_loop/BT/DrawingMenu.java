package ss2_array_loop.BT;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice =-1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                System.out.println("Draw the square triangle");
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }

    }
}
