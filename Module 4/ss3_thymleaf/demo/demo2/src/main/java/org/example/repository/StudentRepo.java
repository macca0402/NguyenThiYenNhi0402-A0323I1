package org.example.repository;
import org.example.model.Student;

import java.util.List;
public interface StudentRepo {

    List<Student> getAll();

    void save(Student student);
}
