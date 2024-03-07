package SS13.BT;

import java.util.Scanner;

public class chuoiLonNhat {
    public static String longestSortedSubstring(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        String result = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            String current = "" + s.charAt(i);
            int currentLength = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) >= s.charAt(j - 1)) {
                    current += s.charAt(j);
                    currentLength++;
                } else {
                    break;
                }
            }
            if (currentLength > maxLength) {
                result = current;
                maxLength = currentLength;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String input = scanner.nextLine();
        String output = longestSortedSubstring(input);
        System.out.println("Chuỗi con có độ dài lớn nhất được sắp xếp theo thứ tự là: " + output);
    }
}

