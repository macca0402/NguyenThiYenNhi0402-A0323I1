package SS4_OOP.DEMO;

public class Student {
    int codeStudent;
    String nameStudent;
    String dateOfBirth;

    public Student() {
        this(0, "", "01/01");
        this.codeStudent = 0;
    }

    public Student(int codeStudent, String nameStudent, String dateOfBirth) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
    }

    public static void main(String[] args) {
        Student demoOOP = new Student(5, "Nhi de huong", "04/02/2002");
        System.out.println(demoOOP.codeStudent);
        Student student = new Student();
        System.out.println(student.dateOfBirth);
    }

}
