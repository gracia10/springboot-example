package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
