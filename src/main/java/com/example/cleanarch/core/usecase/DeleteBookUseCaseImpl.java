package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.exception.BookNotFoundException;
import com.example.cleanarch.core.interfaces.repository.BookRepository;
import com.example.cleanarch.core.interfaces.usecase.DeleteBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteBookUseCaseImpl implements DeleteBookUseCase {

    private final BookRepository bookRepository;

    @Override
    public void deleteBook(long id) {
        Book book = bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
        bookRepository.deleteById(book.getId());
    }

}