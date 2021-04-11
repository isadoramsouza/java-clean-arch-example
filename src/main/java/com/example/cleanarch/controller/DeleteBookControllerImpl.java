package com.example.cleanarch.controller;

import com.example.cleanarch.controller.interfaces.DeleteBookController;
import com.example.cleanarch.core.interfaces.DeleteBookUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteBookControllerImpl implements DeleteBookController {

    private final DeleteBookUseCase useCase;

    @Override
    public void deleteById(long id) {
        useCase.execute(id);
    }
}