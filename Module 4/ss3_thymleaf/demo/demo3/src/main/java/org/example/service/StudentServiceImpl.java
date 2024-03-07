package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public void add(Student student) {
studentRepository.add(student);
    }
}
