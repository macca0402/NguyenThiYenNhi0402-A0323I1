package SS11.BT;

import java.util.Stack;

public class DaoNguocStack {

    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        Stack<Integer> stack= new Stack();
        for(int i=0;i<a.length;i++){
            stack.push(a[i]);
        }
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
