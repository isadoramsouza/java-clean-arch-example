package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindBookUseCaseImpl implements FindBookUseCase {

    private final BookDataProvider bookDataProvider;

    @Override
    public Book execute(long id) {
        return bookDataProvider.findById(id);
    }
}