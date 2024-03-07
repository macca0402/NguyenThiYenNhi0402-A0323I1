package codegym.vn.repository;

import codegym.vn.entity.Blog;
import java.util.List;
public interface BlogRepository {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(int blog_id);
}
