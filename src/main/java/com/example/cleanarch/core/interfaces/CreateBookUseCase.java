package com.example.cleanarch.core.interfaces;

import com.example.cleanarch.core.dto.BookDTO;

public interface CreateBookUseCase {

    BookDTO execute(BookDTO book);
}
