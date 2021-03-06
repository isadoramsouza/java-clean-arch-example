package com.example.cleanarch.data;

import com.example.cleanarch.adapter.BookAdapter;
import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.exception.BookNotFoundException;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.data.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookDataProviderImpl implements BookDataProvider {

    private final BookRepository bookRepository;

    @Override
    public Book findById(long id) {
        return BookAdapter.toBook(bookRepository.findById(id).orElseThrow(BookNotFoundException::new));
    }

    @Override
    public void deleteById(long id) {
        Book book = findById(id);
        bookRepository.deleteById(book.getId());
    }

    @Override
    public Book createBook(Book book) {
        return BookAdapter.toBook(bookRepository.saveAndFlush(BookAdapter.toBookEntity(book)));
    }
}