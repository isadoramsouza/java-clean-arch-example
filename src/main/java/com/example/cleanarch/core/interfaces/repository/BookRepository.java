package com.example.cleanarch.core.interfaces.repository;

import com.example.cleanarch.core.entity.Book;

public interface BookRepository {

    Book findById(long id);
    void deleteById(long id);
}
