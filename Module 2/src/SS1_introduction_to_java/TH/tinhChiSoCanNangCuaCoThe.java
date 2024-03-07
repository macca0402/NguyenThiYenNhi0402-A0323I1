package SS1_introduction_to_java.TH;

import java.util.Scanner;

public class tinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram): ");
        weight = sc.nextDouble();
        System.out.println("Your height (in kilogram): ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println(bmi + "\nUnderweight ");
        } else if (bmi < 25) {
            System.out.println(bmi + "\nNormal ");
        } else if (bmi < 30) {
            System.out.println(bmi + "\nOverweight");
        } else {
            System.out.println(bmi + "\nobese");
        }
    }


}
