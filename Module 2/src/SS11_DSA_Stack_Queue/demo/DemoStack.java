package SS11.demo;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int i=25;
        while(i!=0){
            stack.push(i%2);
            i=i/2;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
