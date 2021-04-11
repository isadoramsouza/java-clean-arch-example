package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.DeleteBookUseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteBookUseCaseImpl implements DeleteBookUseCase {

    private final BookDataProvider bookDataProvider;

    @Override
    public void execute(long id) {
        bookDataProvider.deleteById(id);
    }

}