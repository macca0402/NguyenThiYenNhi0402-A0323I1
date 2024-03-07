package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    void save(Student student);
}
