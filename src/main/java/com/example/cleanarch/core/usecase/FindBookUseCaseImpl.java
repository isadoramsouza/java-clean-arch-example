package com.example.cleanarch.core.usecase;

import com.example.cleanarch.adapter.BookAdapter;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindBookUseCaseImpl implements FindBookUseCase {

    private final BookDataProvider bookDataProvider;

    @Override
    public BookDTO execute(long id) {
        return BookAdapter.toBookDTO(bookDataProvider.findById(id));
    }
}