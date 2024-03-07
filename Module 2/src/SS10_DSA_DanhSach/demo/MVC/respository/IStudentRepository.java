package SS10.demo.MVC.respository;

import SS10.demo.MVC.model.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student>{
    void addStudent(Student student);

    void remove(int code);

    List<Student> getAll();
}
