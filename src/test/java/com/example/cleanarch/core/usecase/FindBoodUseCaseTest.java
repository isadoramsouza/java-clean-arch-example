package com.example.cleanarch.core.usecase;

import com.example.cleanarch.adapter.BookAdapter;
import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.exception.BookNotFoundException;
import com.example.cleanarch.core.interfaces.BookDataProvider;
import com.example.cleanarch.core.interfaces.FindBookUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class FindBoodUseCaseTest {


    @Mock
    private BookDataProvider bookDataProvider;

    private FindBookUseCase useCase;

    @BeforeEach
    void initUseCase() {
        useCase = new FindBookUseCaseImpl(
                bookDataProvider
        );
    }

    @Test
    void findBoodByIdAndReturnsAValidBookTest() {
        final BookDTO book = BookDTO.builder()
                .id(1L)
                .name("Test")
                .author("Author")
                .build();

        when(bookDataProvider.findById(1L)).thenReturn(BookAdapter.toBook(book));
        BookDTO bookDTOOutput = useCase.execute(1L);
        assertThat(book, is(equalTo(bookDTOOutput)));
        verify(bookDataProvider, times(1)).findById(1L);
    }

    @Test
    void findBookByIdWithNonExistIdTest() {
        when(bookDataProvider.findById(anyLong())).thenThrow(BookNotFoundException.class);
        assertThrows(BookNotFoundException.class, () -> useCase.execute(anyLong()));
    }
}
