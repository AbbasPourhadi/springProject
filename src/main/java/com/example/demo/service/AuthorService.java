package com.example.demo.service;

import com.example.demo.repository.AuthorRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo){
        this.authorRepo = authorRepo;
    }
}
