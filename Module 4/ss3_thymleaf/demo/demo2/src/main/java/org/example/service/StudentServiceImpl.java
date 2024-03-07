package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepo;
import org.example.repository.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return studentRepo.getAll();
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);

    }
}
