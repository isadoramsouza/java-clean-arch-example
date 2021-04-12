package com.example.cleanarch.core.usecase;

import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.DeleteBookUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class DeleteBoodUseCaseTest {


    @Mock
    private BookDataProvider bookDataProvider;

    private DeleteBookUseCase useCase;

    @BeforeEach
    void initUseCase() {
        useCase = new DeleteBookUseCaseImpl(
                bookDataProvider
        );
    }

    @Test
    void deleteBookWithAnExistIdTest() {
        useCase.execute(1L);
        verify(bookDataProvider, times(1)).deleteById(1L);
    }

}
