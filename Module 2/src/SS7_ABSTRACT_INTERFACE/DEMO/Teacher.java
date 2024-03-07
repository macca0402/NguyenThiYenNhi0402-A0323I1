package SS7_ABSTRACT_INTERFACE.DEMO;

public class Teacher extends Person implements ISinhHoat {
    private double salary;
    private String position;

    public Teacher() {
    }

    @Override
    public void diLam() {
        System.out.println("Đi dạy");
    }

    public Teacher(int code, String name, String dateOfBirth, double salary, String position) {
        super(code, name, dateOfBirth);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void an() {

    }
}
