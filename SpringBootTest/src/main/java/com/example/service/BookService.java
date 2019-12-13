package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.Book;

@Service
public interface BookService {
    List<Book> getBookList();
}
