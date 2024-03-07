package com.example.blog_nang_cap.repository;

import com.example.blog_nang_cap.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BlogRepository  extends JpaRepository<Blog,Integer> {
    @Query("from Blog b order by b.dateCreate asc")
    List<Blog> ascDate();
    List<Blog> findAllByTitleContaining(String title);
}

