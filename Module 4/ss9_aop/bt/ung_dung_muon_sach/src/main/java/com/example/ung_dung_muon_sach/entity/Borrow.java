package com.example.ung_dung_muon_sach.entity;

import jakarta.persistence.*;

import java.util.concurrent.ThreadLocalRandom;

@Entity
@Table(name = "borrow")
public class Borrow {
    @Id
    private int codeBorrow = ThreadLocalRandom.current().nextInt(10000,99999);
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Borrow(Book book) {
        this.book = book;
    }

    public Borrow() {
    }

    public Borrow(int codeBorrow, Book book) {
        this.codeBorrow = codeBorrow;
        this.book = book;
    }


    public int getCodeBorrow() {
        return codeBorrow;
    }


    public void setCodeBorrow(int codeBorrow) {
        this.codeBorrow = codeBorrow;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public static void main(String[] args) {
        Borrow borrow = new Borrow();
        System.out.println("Mã số : " + borrow.getCodeBorrow());
    }
}
