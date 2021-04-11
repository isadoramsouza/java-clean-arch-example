package com.example.cleanarch.controller.interfaces;


import com.example.cleanarch.core.dto.BookDTO;

public interface CreateBookController {

    BookDTO createBook(BookDTO bookDTO);
}