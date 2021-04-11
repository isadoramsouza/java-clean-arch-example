package com.example.cleanarch.controller;

import com.example.cleanarch.controller.interfaces.FindBookController;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindBookControllerImpl implements FindBookController {

    private final FindBookUseCase useCase;

    @Override
    public BookDTO findById(long id) {
        return useCase.execute(id);
    }
}