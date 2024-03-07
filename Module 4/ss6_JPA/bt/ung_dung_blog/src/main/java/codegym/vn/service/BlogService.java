package codegym.vn.service;

import codegym.vn.entity.Blog;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(int blogId);
}
