package SS3_Mang_Method.TH;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] listName = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String value = sc.nextLine();
        String x = "";
        for (int i = 0; i < listName.length; i++) {
            if (listName[i].equals(value) == true) {
                x = listName[i];
                break;
            }
        }
        if (x == "") {
            System.out.println("Khong tim thay");
        } else {
            System.out.println(x + " co trong danh sach");
        }

    }

}
