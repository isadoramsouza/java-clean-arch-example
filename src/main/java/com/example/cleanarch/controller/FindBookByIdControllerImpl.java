package com.example.cleanarch.controller;

import com.example.cleanarch.application.entrypoint.dto.BookDTO;
import com.example.cleanarch.controller.interfaces.FindBookByIdController;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import com.example.cleanarch.data.adapter.BookAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindBookByIdControllerImpl implements FindBookByIdController {

    private final FindBookUseCase useCase;

    @Override
    public BookDTO findById(long id) {
        return BookDTO.fromBookEntity(BookAdapter.toBusinessEntity(useCase.execute(id)));
    }
}