package SS7_ABSTRACT_INTERFACE.DEMO;

public class Student extends Person implements IHoc, ISinhHoat {

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public Student() {
    }

    @Override
    public void diLam() {
        System.out.println("Đi học");
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
     Person person = new Student();
     person.diLam();
    }

    @Override
    public void hocThem() {

    }

    @Override
    public void hocTrenTruong() {

    }

    @Override
    public void an() {

    }
}
