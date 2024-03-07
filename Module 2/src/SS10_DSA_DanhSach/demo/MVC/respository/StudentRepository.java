package SS10.demo.MVC.respository;

import SS10.demo.MVC.ReadWriteFile.ReadWriteFile;
import SS10.demo.MVC.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {

    @Override
    public void addStudent(Student student) {
        ReadWriteFile.writeFile("src/SS10/demo/data/student.csv",convertToString(student),true);
    }



    @Override
    public void remove(int code) {
        List<Student> students = getAll();
        for (Student student : students) {
            if (student.getCode() == code) {
                System.out.println("Bạn có muốn xóa student có code là : " + code);
                System.out.println("1.Đồng ý");
                System.out.println("2.Hủy bỏ");
                int choice = Integer.parseInt(new Scanner(System.in).nextLine());
                if (choice == 1) {
                    students.remove(student);
                    String str = "";
                    for (Student temp : students) {
                        str += convertToString(temp) + "\n";
                    }
                    str=str.substring(0,str.length()-3);
                    ReadWriteFile.writeFile("src/SS10/demo/data/student.csv",str,false);
                    System.out.println("Xóa thành công");
                }
                break;
            }
        }

    }

    private String convertToString(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getDateOfBirth() + "," + student.getGrade();
    }

    @Override
    public void add(Student student) {
        ReadWriteFile.writeFile("src/SS10/demo/data/student.csv",convertToString(student),true);

    }

    @Override
    public List<Student> getAll() {
        List<Student> students=new ArrayList<>();
        List<String> strings=ReadWriteFile.readFile("src/SS10/demo/data/student.csv");
        String[] temp;
        for(String str:strings){
            temp=str.split(",");
            students.add(new Student(Integer.parseInt(temp[0]),temp[1],temp[2],Double.parseDouble(temp[3])));
        }
        return students;
    }

}
