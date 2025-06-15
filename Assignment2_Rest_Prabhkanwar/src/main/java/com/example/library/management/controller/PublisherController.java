package com.example.library.management.controller;

import com.example.library.management.model.Publisher;
import com.example.library.management.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherRepository repo;

    @PostMapping
    public Publisher addPublisher(@RequestBody Publisher publisher) {
        return repo.save(publisher);
    }

    @GetMapping
    public List<Publisher> getAllPublishers() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Publisher getPublisherById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }
}
