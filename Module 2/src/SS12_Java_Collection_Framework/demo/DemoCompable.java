package SS12.demo;

import java.util.Set;
import java.util.TreeSet;

public class DemoCompable {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        set.add(new Student(1,"nhi xinh dep","12/12/2012"));
        set.add(new Student(2,"lan xinh dep","12/12/2012"));
        set.add(new Student(3,"Tan xinh dep","12/12/2012"));
        for(Student student:set){
            System.out.println(student);
        }
    }
}
