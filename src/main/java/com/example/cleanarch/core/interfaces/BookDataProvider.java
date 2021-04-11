package com.example.cleanarch.core.interfaces;

import com.example.cleanarch.core.entity.Book;

public interface BookDataProvider {

    Book findById(long id);
    void deleteById(long id);
    Book createBook(Book book);
}
