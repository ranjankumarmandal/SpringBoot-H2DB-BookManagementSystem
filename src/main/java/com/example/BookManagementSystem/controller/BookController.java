package com.example.BookManagementSystem.controller;

import com.example.BookManagementSystem.entity.Book;
import com.example.BookManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addbook")
    public ResponseEntity addBook(@RequestBody Book book) {

    }
}
