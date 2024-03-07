package org.example.repository;

import org.example.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoImpl implements StudentRepository{
    private static List<Student> list;
    static {
        list=new ArrayList<>();
        list.add(new Student("Nhi",9));
        list.add(new Student("Lan",6));
        list.add(new Student("Peter",7));
        list.add(new Student("Hà",8));
    }

    @Override
    public List<Student> getAll() {
        return list;
    }

    @Override
    public void add(Student student) {
        list.add(student);
    }
}
