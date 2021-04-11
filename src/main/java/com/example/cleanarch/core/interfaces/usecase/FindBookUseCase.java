package com.example.cleanarch.core.interfaces.usecase;

import com.example.cleanarch.core.entity.Book;

public interface FindBookUseCase {

    Book findById(long id);
}
