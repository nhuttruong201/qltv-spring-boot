package com.example.qlthuvien.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("")
    public ResponseEntity<?> getAllBook(@RequestHeader(value = "username", defaultValue = "null") String username) {

        System.out.println(">> check header: " + username);

        List<Book> listBooks = fakeData();
        return ResponseEntity.status(HttpStatus.OK).body(listBooks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    List<Book> fakeData() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Book 1", "Nhut Truong"));
        books.add(new Book(2, "Book 2", "Trung Dam"));
        books.add(new Book(3, "Book 3", "Map Dit"));
        return books;
    }
}

class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
