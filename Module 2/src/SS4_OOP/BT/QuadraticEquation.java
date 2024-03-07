package SS4_OOP.BT;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1() {
        return (-this.getB() + Math.sqrt(this.getDiscriminant())) / 2 * this.getA();
    }

    public double getRoot2() {
        return (-this.getB() - Math.sqrt(this.getDiscriminant())) / 2 * this.getA();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadraticEquation q = new QuadraticEquation(1, 3, 1);
        if (q.getDiscriminant() > 0) {
            System.out.println("x1 = " + q.getRoot1());
            System.out.println("x2 = " + q.getRoot2());
        } else if (q.getDiscriminant() == 0) {
            System.out.println("Nghiem kep x1=x2= " + q.getRoot1());
        } else {
            System.out.println("The equation has no roots ");
        }

    }
}
