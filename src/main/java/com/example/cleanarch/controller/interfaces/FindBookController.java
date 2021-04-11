package com.example.cleanarch.controller.interfaces;

import com.example.cleanarch.core.dto.BookDTO;

public interface FindBookController {

    BookDTO findById(long id);
}