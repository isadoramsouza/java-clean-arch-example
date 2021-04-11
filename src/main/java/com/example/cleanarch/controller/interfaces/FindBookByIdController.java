package com.example.cleanarch.controller.interfaces;

import com.example.cleanarch.application.entrypoint.dto.BookDTO;

public interface FindBookByIdController {

    BookDTO findById(long id);
}