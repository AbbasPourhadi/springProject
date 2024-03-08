package com.example.demo.controller;

import com.example.demo.service.GenreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {
    private GenreService genreService;
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }
}
