package SS12.Comparable_Comparator;

import java.util.*;

public class AgeComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        } else if(o1.getAge() == o2.getAge()){
            return 0;
        } else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Student2 student=new Student2("Kien",30,"HT");
        Student2 student2=new Student2("Nam",26,"HN");
        Student2 student3=new Student2("Anh",38,"HT");
        Student2 student4=new Student2("Tung",38,"HT");

        List<Student2> lists= new ArrayList<Student2>();
        lists.add(student);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student2 st:lists){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for(Student2 st : lists){
            System.out.println(st.toString());
        }
    }
}
