package com.example.blog_nang_cap.service;
import com.example.blog_nang_cap.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
public interface BlogService extends Service<Blog>{
    Page<Blog> findAll(Pageable pageable);
    List<Blog> ascDate();

    List<Blog> title(String name);

}
