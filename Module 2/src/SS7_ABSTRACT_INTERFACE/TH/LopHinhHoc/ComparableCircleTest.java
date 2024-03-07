package SS7_ABSTRACT_INTERFACE.TH.LopHinhHoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[0]=new ComparableCircle();
        circles[0]=new ComparableCircle(3.5,"indigo",false);
        System.out.println("Pre-sorted: ");
        for(ComparableCircle c:circles){
            System.out.println(c);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted: ");
        for(ComparableCircle circle:circles){
            System.out.println(circle);
        }
    }
}
