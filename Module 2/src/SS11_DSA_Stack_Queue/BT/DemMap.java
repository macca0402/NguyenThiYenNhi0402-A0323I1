package SS11.BT;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class DemMap {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        str = sc.nextLine();
        String[] ar = str.split(" ");
//        ArrayList<String> ar= new ArrayList<>();
//        ar.add("Tan");
//        ar.add("yeu");
//        ar.add("Nhi");
//        ar.add("Tan");
//        ar.add("Tan");
//        ar.add("tan");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
            } else {
                map.put(ar[i], 1);
            }
//            if(map.containsKey(str.charAt(i)));
        }
        System.out.println(map);

    }
}
