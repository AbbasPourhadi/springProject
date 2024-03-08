package com.example.demo.service;

import com.example.demo.repository.GenreRepo;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    private GenreRepo genreRepo;

    public GenreService(GenreRepo genreRepo) {
        this.genreRepo = genreRepo;
    }
}
