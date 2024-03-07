package SS11.BT;

import java.util.*;
import java.util.Queue;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
        Stack<String> stack = new Stack();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            String arr = String.valueOf(str.charAt(i)).toLowerCase(Locale.ROOT);
            if (!arr.equals(" ")) {
                stack.push(arr);
                queue.add(arr);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        if (checkPalindrome(str)) {
            System.out.println("Chuoi doi xung");
        } else {
            System.out.println("Khong doi xung");
        }
    }
}
