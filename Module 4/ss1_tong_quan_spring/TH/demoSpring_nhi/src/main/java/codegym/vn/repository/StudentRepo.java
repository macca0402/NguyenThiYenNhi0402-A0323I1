package codegym.vn.repository;

import codegym.vn.entity.Student;
import java.util.List;
public interface StudentRepo {
    void create(Student student);
    void delete(Student student);
    void update(Student student);
    Student findById(String id);
    List<Student> findAll();
}
