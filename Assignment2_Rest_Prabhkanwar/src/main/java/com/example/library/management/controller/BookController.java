package com.example.library.management.controller;

import com.example.library.management.model.Book;
import com.example.library.management.model.Publisher;
import com.example.library.management.repository.BookRepository;
import com.example.library.management.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @Autowired
    private PublisherRepository publisherRepo;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        
        int pubId = book.getPublisher().getPubId();
        Publisher fullPublisher = publisherRepo.findById(pubId).orElse(null);
        book.setPublisher(fullPublisher);
        return bookRepo.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookRepo.findById(id).orElse(null);
    }
}
