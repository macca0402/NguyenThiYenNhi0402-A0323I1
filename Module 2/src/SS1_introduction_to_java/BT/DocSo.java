
package SS1_introduction_to_java.BT;

import java.util.Scanner;

public class DocSo{
    public DocSo() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen khong am de doc: ");
        int num = sc.nextInt();
        String so = "";
        int one = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;
        int thousand = num / 1000 % 10;
        switch(thousand) {
            case 1:
                so = so + "One Thousand";
                break;
            case 2:
                so = so + "Two Thousand";
                break;
            case 3:
                so = so + "Three Thousand";
                break;
            case 4:
                so = so + "Four Thousand";
                break;
            case 5:
                so = so + "Five Thousand";
                break;
            case 6:
                so = so + "Six Thousand";
                break;
            case 7:
                so = so + "Seven Thousand";
                break;
            case 8:
                so = so + "Eight Thousand";
                break;
            case 9:
                so = so + "Nine Thousand";
        }

        switch(hundred) {
            case 1:
                so = so + "One Hundred";
                break;
            case 2:
                so = so + "Two Hundred";
                break;
            case 3:
                so = so + "Three Hundred";
                break;
            case 4:
                so = so + "Four Hundred";
                break;
            case 5:
                so = so + "Five Hundred";
                break;
            case 6:
                so = so + "Six Hundred";
                break;
            case 7:
                so = so + "Seven Hundred";
                break;
            case 8:
                so = so + "Eight Hundred";
                break;
            case 9:
                so = so + "Nine Hundred";
        }

        switch(ten) {
            case 1:
                so = so + "Eleven";
                break;
            case 2:
                so = so + "Twelve";
                break;
            case 3:
                so = so + "Thirteen";
                break;
            case 4:
                so = so + "Fourteen";
                break;
            case 5:
                so = so + "Fiveteen";
                break;
            case 6:
                so = so + "Sixteen";
                break;
            case 7:
                so = so + "Seventeen";
                break;
            case 8:
                so = so + "Eighteen";
                break;
            case 9:
                so = so + "Nineteen";
        }

        switch(one) {
            case 0:
                if (num == 0) {
                    so = so + "Zero";
                }
                break;
            case 1:
                if (ten == 0) {
                    so = so + "One";
                } else {
                    so = so + "Two";
                }
            case 2:
            default:
                break;
            case 3:
                so = so + "Three";
                break;
            case 4:
                so = so + "Four";
                break;
            case 5:
                so = so + "Five";
                break;
            case 6:
                so = so + "Six";
                break;
            case 7:
                so = so + "Seven";
                break;
            case 8:
                so = so + "Eight";
                break;
            case 9:
                so = so + "Nine";
                break;
            case 10:
                so = so + "Ten";
        }

        System.out.println("Số " + num + " được đọc là: " + so);
    }
}
