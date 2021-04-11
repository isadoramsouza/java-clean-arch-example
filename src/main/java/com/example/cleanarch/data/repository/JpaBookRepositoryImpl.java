package com.example.cleanarch.data.repository;

import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.exception.BookNotFoundException;
import com.example.cleanarch.core.interfaces.repository.BookRepository;
import com.example.cleanarch.data.adapter.BookAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JpaBookRepositoryImpl implements BookRepository {

    private final JpaBookRepository bookRepository;

    @Override
    public Book findById(long id) {
        return BookAdapter.fromBusinessEntity(bookRepository.findById(id).orElseThrow(BookNotFoundException::new));
    }

    @Override
    public void deleteById(long id) {
        Book book = findById(id);
        bookRepository.deleteById(book.getId());
    }
}