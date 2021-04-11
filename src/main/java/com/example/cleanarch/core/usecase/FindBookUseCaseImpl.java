package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.interfaces.repository.BookRepository;
import com.example.cleanarch.core.interfaces.usecase.FindBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindBookUseCaseImpl implements FindBookUseCase {

    private final BookRepository bookRepository;

    @Override
    public Book execute(long id) {
        return bookRepository.findById(id);
    }
}