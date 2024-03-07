package SS6_Ke_Thua.demo;

public class Student extends Person{

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public Student() {
    }

    public Student(int code, String name, String date, double point) {
        super(code, name, date);
        this.grade = point;
    }

    @Override
    public String toString() {
        return "Tên: "+ super.getName() +", ngày sinh: "+ super.getDateOfBirth();
    }




    public static void main(String[] args) {
        Person student = new Student(1, "HaiTT", "12/12/1222", 9);
        if(student instanceof Teacher) {
            System.out.println(((Teacher) student).getSalary());
        }
        System.out.println(student);
    }
}
