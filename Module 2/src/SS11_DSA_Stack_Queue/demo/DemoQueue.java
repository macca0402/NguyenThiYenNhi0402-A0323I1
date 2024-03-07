package SS11.demo;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(1);
        queue.add(1);
        for(Integer i:queue){
            System.out.println(i);
        }
    }
}
