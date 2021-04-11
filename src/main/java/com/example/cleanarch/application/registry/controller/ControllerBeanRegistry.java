package com.example.cleanarch.application.registry.controller;

import com.example.cleanarch.controller.CreateBookControllerImpl;
import com.example.cleanarch.controller.DeleteBookControllerImpl;
import com.example.cleanarch.controller.FindBookControllerImpl;
import com.example.cleanarch.core.interfaces.CreateBookUseCase;
import com.example.cleanarch.core.interfaces.DeleteBookUseCase;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ControllerBeanRegistry {

    private final FindBookUseCase findBookUseCase;
    private final DeleteBookUseCase deleteBookUseCase;
    private final CreateBookUseCase createBookUseCase;

    @Bean("FindBookByIdController")
    public FindBookControllerImpl createFindBookControllerImpl() {
        return new FindBookControllerImpl(findBookUseCase);
    }

    @Bean("DeleteBookByIdController")
    public DeleteBookControllerImpl createDeleteBookControllerImpl() {
        return new DeleteBookControllerImpl(deleteBookUseCase);
    }

    @Bean("CreateBookByIdController")
    public CreateBookControllerImpl createCreateBookControllerImpl() {
        return new CreateBookControllerImpl(createBookUseCase);
    }
}