package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.application.entrypoint.dto.BookDTO;
import com.example.cleanarch.controller.interfaces.FindBookByIdController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value="/api/book",  produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class FindBookByIdEntryPoint {

    private final FindBookByIdController findBookByIdController;

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> findBookById(@PathVariable long id) {
        return new ResponseEntity<>(findBookByIdController.findById(id), HttpStatus.OK);
    }
}