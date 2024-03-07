package SS5_ACCESS_MODIFIER.TH;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // khoi tao constructor cho class
    public Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // khoi tao phuong thuc static de thay doi gia tri cua bien college;
    static void change() {
        college = "CODEGYM";
    }

// khoi tao phuong thuc display

    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();


        // tao doi tuong:
        Student s1 = new Student(1, "DAO");
        Student s2 = new Student(2, "ANH");
        Student s3 = new Student(3, "TU");

        // Goi phuong thuc display;

        s1.display();
        s2.display();
        s3.display();
    }
}