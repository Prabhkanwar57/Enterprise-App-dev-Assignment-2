package com.example.library.management.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pubId;

    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")
    @com.fasterxml.jackson.annotation.JsonManagedReference
    private List<Book> books;

    public Publisher() {}

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
