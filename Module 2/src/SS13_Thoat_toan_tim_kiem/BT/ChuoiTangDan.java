package SS13.BT;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string: ");
        String str = "Welcome";
        LinkedList<Character> result = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i; j < str.length(); j++) {
                if (list.getLast() < str.charAt(j)) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > result.size()) {
                result.clear();
                result = list;
            }
        }
        for (Character a : result) {
            System.out.println(a);
        }
    }
}
