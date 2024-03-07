package codegym.vn.repository;

import codegym.vn.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class StudentRepoImpl implements StudentRepo{
    private static Map<String,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put("SVOO1",new Student("SV001","Hải","Da Nang"));
        studentMap.put("SVOO2",new Student("SV002","Hà","Da Nang"));
        studentMap.put("SVOO3",new Student("SV003","Hồng","Da Nang"));
        studentMap.put("SVOO4",new Student("SV004","Hải Hoàng","Da Nang"));
    }
    @Override
    public void create(Student student) {
        if(!studentMap.containsKey(student.getId())){
            studentMap.put(student.getId(),student);
        }

    }

    @Override
    public void delete(Student student) {
        if(studentMap.containsKey(student.getId())){
            studentMap.remove(student.getId());
        }

    }

    @Override
    public void update(Student student) {
        if(studentMap.containsKey(student.getId())){
            studentMap.put(student.getId(),student);
        }

    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }
}
