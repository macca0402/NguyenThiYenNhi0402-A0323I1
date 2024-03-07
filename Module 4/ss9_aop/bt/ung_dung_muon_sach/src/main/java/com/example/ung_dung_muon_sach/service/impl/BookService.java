package com.example.ung_dung_muon_sach.service.impl;

import com.example.ung_dung_muon_sach.entity.Book;
import com.example.ung_dung_muon_sach.repository.BookRepository;
import com.example.ung_dung_muon_sach.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private BookRepository repository;
    @Override
    public boolean create(Book book) {
        repository.save(book);
        return true;
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return repository.findAll();
    }
}
