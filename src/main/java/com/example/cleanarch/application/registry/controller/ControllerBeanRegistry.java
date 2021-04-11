package com.example.cleanarch.application.registry.controller;

import com.example.cleanarch.controller.DeleteBookByIdControllerImpl;
import com.example.cleanarch.controller.FindBookByIdControllerImpl;
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

    @Bean("FindBookByIdController")
    public FindBookByIdControllerImpl createFindBookByIdControllerImpl() {
        return new FindBookByIdControllerImpl(findBookUseCase);
    }

    @Bean("DeleteBookByIdController")
    public DeleteBookByIdControllerImpl createDeleteBookByIdControllerImpl() {
        return new DeleteBookByIdControllerImpl(deleteBookUseCase);
    }
}