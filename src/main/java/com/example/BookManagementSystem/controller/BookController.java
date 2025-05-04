package com.example.BookManagementSystem.controller;

import com.example.BookManagementSystem.entity.Book;
import com.example.BookManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addbook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/getbook/{bookname}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookname") String name) {
        final Book bookByName = bookService.getBookByName(name);
        return ResponseEntity.ok(bookByName);
    }

    @PutMapping("/updatebook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }
}
