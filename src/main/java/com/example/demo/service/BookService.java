package com.example.demo.service;

import com.example.demo.repository.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

}
