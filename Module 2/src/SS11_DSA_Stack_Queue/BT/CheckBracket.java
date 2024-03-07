package SS11.BT;

import java.util.Locale;
import java.util.Stack;

public class CheckBracket {
    private static String left;

    public static boolean checkCoupleBracket(String a, String b) {
        if (a.equals("(") && b.equals(")")) {
            return true;
        }
        return false;
    }

    public static boolean checkBracket(String str) {
        Stack<String> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String arr = String.valueOf(str.charAt(i)).toLowerCase(Locale.ROOT);
            if (arr.equals("(")) {
                bStack.push(arr);
            }
            if (arr.equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                }
                left = bStack.pop();
                if (!checkCoupleBracket(left, arr)) {
                    return false;
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr = "s * (s – a) * (s – b * (s – c)   ";
        System.out.println(checkBracket(arr));
    }
}
