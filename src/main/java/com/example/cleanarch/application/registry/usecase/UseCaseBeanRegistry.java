package com.example.cleanarch.application.registry.usecase;

import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.DeleteBookUseCase;
import com.example.cleanarch.core.usecase.DeleteBookUseCaseImpl;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import com.example.cleanarch.core.usecase.FindBookUseCaseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCaseBeanRegistry {

    private final BookDataProvider bookRepository;

    @Bean("FindBookUseCase")
    public FindBookUseCase createFindBookUseCase() {
        return new FindBookUseCaseImpl(bookRepository);
    }

    @Bean("DeleteBookUseCase")
    public DeleteBookUseCase createDeleteBookUseCase() {
        return new DeleteBookUseCaseImpl(bookRepository);
    }
}