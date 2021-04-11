package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.controller.interfaces.CreateBookController;
import com.example.cleanarch.core.dto.BookDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value="/api/book",  produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CreateBookEntryPoint {

    private final CreateBookController createBookController;

    @PostMapping("")
    @ApiOperation(value = "Creates book")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Book created"),
            @ApiResponse(code = 500, message = "Error")
    })
    public ResponseEntity<BookDTO> findBookById(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(createBookController.createBook(bookDTO), HttpStatus.CREATED);
    }
}