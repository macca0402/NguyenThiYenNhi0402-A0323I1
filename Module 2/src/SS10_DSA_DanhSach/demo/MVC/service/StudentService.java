package SS10.demo.MVC.service;

import SS10.demo.MVC.model.Student;
import SS10.demo.MVC.respository.IStudentRepository;
import SS10.demo.MVC.respository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService{
    private Scanner scanner= new Scanner(System.in);
    private static IStudentRepository iStudentRepository= new StudentRepository();

    @Override
    public void addStudent() {
        Student student=inputInfo();
        iStudentRepository.addStudent(student);
        System.out.println("Thêm mới thành công");
        System.out.println("===========================");
    }
    @Override
    public void displayAllStudent() {
        List<Student> studentList=iStudentRepository.getAll();
        for(Student student:studentList){
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
        System.out.println("Nhập code để xóa: ");
        int code=Integer.parseInt(scanner.nextLine());
        iStudentRepository.remove(code);
    }


    public Student inputInfo(){
        Student student= new Student();
        System.out.println("Nhap ma: ");
        student.setCode(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap ten: ");
        student.setName(scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        student.setDateOfBirth(scanner.nextLine());
        System.out.println("Nhap diem: ");
        student.setGrade(Double.parseDouble(scanner.nextLine()));
        return student;
    }
}
