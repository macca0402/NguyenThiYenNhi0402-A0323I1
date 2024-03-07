package SS11.BT;

import java.util.Stack;

public class ThapPhanNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int i = 24;
        while (i != 0) {
            stack.push(i % 2);
            i = i / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
