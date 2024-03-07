package SS10.demo.Set;

import java.util.Set;
import java.util.TreeSet;

public class demoSet {
    public static void main(String[] args) {
        Set<String> strings=new TreeSet<>();
        strings.add("Hai");
        strings.add("abc");
        strings.add("abc");
        strings.add("abc");
        strings.add("abc");
        for(String str: strings){
            System.out.println(str);
        }
    }
}
