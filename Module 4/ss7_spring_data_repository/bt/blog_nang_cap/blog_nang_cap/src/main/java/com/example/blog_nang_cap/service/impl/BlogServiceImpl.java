package com.example.blog_nang_cap.service.impl;

import com.example.blog_nang_cap.entity.Blog;
import com.example.blog_nang_cap.repository.BlogRepository;
import com.example.blog_nang_cap.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public boolean create(Blog blog) {
        blogRepository.save(blog);
        return true;
    }

    @Override
    public boolean update(Blog blog) {
        blogRepository.save(blog);
        return true;
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        blogRepository.deleteById(id);
        return true;
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public List<Blog> ascDate() {
        return blogRepository.ascDate();
    }

    @Override
    public List<Blog> title(String name) {
        return blogRepository.findAllByTitleContaining(name);
    }


}
