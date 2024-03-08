package com.example.demo.controller;

import com.example.demo.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }
}
