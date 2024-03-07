package com.example.ung_dung_muon_sach.service.impl;

import com.example.ung_dung_muon_sach.entity.Book;
import com.example.ung_dung_muon_sach.entity.Borrow;
import com.example.ung_dung_muon_sach.repository.BookRepository;
import com.example.ung_dung_muon_sach.repository.BorrowRepository;
import com.example.ung_dung_muon_sach.service.IBookService;
import com.example.ung_dung_muon_sach.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowService implements IBorrowService {
    @Autowired
    private BorrowRepository repository;
    @Autowired
    private IBookService bookService;

    @Override
    public boolean create(Borrow borrow) {
        Book book = new Book();
        book = bookService.findById(borrow.getBook().getId());
        int newQuantity = book.getQuantity();
        if (newQuantity == 0) {
            return false;
        }
        book.setQuantity(book.getQuantity() - 1);
        repository.save(borrow);
        return true;
    }


    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Borrow findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Borrow> getAll() {
        return repository.findAll();
    }

    @Override
    public boolean checkBorrowed(int id) {
        for (Borrow br : repository.findAll()) {
            if (br.getCodeBorrow() == id) {
                return true;
                // co muon sach
            }
        }
        return false;
        // khong muon sach
    }

    @Override
    public boolean doReturnBook(int id) {
        for (Borrow br : repository.findAll()) {
            if (br.getCodeBorrow()==id) {
                br.getBook().setQuantity(br.getBook().getQuantity() + 1);
                repository.deleteById(id);
                return true;
            }
        }
        return false;
    }

}
