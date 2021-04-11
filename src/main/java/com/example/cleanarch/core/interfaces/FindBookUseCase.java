package com.example.cleanarch.core.interfaces;

import com.example.cleanarch.core.entity.Book;

public interface FindBookUseCase {

    Book execute(long id);
}
