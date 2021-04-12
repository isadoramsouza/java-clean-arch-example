package com.example.cleanarch.core.usecase;

import com.example.cleanarch.adapter.BookAdapter;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.CreateBookUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class CreateBoodUseCaseTest {


    @Mock
    private BookDataProvider bookDataProvider;

    private CreateBookUseCase useCase;

    @BeforeEach
    void initUseCase() {
        useCase = new CreateBookUseCaseImpl(
                bookDataProvider
        );
    }

    @Test
    void createAValidBookTest() {
        final BookDTO book = BookDTO.builder()
                .id(1L)
                .name("Test")
                .author("Author")
                .build();

        when(bookDataProvider.createBook(BookAdapter.toBook(book))).thenReturn(BookAdapter.toBook(book));
        BookDTO bookDTOOutput = useCase.execute(book);
        assertThat(book, is(equalTo(bookDTOOutput)));
        verify(bookDataProvider, times(1)).createBook(BookAdapter.toBook(book));
    }
}
