package com.example.demo.service;

import com.example.demo.repository.PublisherRepo;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    private PublisherRepo publisherRepo;

    public PublisherService(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }
}
