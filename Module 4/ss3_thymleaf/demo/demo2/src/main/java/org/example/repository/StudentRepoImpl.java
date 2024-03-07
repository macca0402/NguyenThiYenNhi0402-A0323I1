package org.example.repository;

import org.example.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoImpl implements StudentRepo{
    public static List<Student> list;
    static {
        list=new ArrayList<>();
        list.add(new Student("Dương Thị Thu Hà",10));
        list.add(new Student("Dương Thị Thu",2));
        list.add(new Student("Dương Trang ",1));
    }

    @Override
    public List<Student> getAll() {
        return list;
    }

    @Override
    public void save(Student student) {
        list.add(student);
    }
}
