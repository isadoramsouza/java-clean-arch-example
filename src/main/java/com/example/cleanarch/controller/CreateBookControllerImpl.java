package com.example.cleanarch.controller;

import com.example.cleanarch.controller.interfaces.CreateBookController;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.interfaces.CreateBookUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateBookControllerImpl implements CreateBookController {

    private final CreateBookUseCase useCase;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        return useCase.execute(bookDTO);
    }
}