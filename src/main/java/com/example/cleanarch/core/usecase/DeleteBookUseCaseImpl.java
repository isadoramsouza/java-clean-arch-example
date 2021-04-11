package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.interfaces.repository.BookRepository;
import com.example.cleanarch.core.interfaces.usecase.DeleteBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteBookUseCaseImpl implements DeleteBookUseCase {

    private final BookRepository bookRepository;

    @Override
    public void execute(long id) {
        Book book = bookRepository.findById(id);
        bookRepository.deleteById(book.getId());
    }

}