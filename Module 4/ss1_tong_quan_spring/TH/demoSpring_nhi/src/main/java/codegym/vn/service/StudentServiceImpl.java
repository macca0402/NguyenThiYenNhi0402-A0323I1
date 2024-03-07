package codegym.vn.service;

import codegym.vn.entity.Student;
import codegym.vn.repository.StudentRepo;
import codegym.vn.repository.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentSevice {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void create(Student student) {
        studentRepo.create(student);

    }

    @Override
    public void delete(Student student) {
        studentRepo.delete(student);
    }

    @Override
    public void update(Student student) {
studentRepo.update(student);
    }

    @Override
    public Student findById(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

}
