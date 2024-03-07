package SS5_ACCESS_MODIFIER.BT;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setClasses(String classes) {
        this.classes = classes;
        return classes;
    }

    static class Test {
        public static void main(String[] args) {
            Student student = new Student();
            System.out.println(student.setName("Nhi"));
            System.out.println(student.setClasses("TPM1"));
        }
    }
}
