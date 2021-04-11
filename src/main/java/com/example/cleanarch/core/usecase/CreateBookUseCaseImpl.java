package com.example.cleanarch.core.usecase;

import com.example.cleanarch.adapter.BookAdapter;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.CreateBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateBookUseCaseImpl implements CreateBookUseCase {

    private final BookDataProvider bookDataProvider;

    @Override
    public BookDTO execute(BookDTO bookDTO) {
        return BookAdapter.toBookDTO(bookDataProvider.createBook(BookAdapter.toBook(bookDTO)));
    }
}