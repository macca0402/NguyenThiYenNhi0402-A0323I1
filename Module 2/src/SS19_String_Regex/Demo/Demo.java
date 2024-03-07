package SS19_String_Regex.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        String a="haiTT";
//        String b=new String("HaiTT");
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        StringBuilder stringBuilder=new StringBuilder("haiTT");
//        stringBuilder.append("CodeGym");
//        System.out.println(stringBuilder);
        Scanner scanner=new Scanner(System.in);
        boolean isFlag;
        String chuoi="";
        do{
            System.out.println("Mời bạn nhập chuỗi: ");
            chuoi=scanner.nextLine();
            isFlag=chuoi.matches("(^[A-Z][a-z]+)([A-Z][a-z]+)*$");
        }while (!isFlag);
    }
}
