package com.example.cleanarch.core.interfaces.repository;

import com.example.cleanarch.core.entity.Book;

import java.util.Optional;

public interface BookRepository {

    Optional<Book> findById(long id);
    void deleteById(long id);
}
