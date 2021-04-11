package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.controller.interfaces.DeleteBookByIdController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class DeleteBookByIdEntryPoint {

    private final DeleteBookByIdController deleteBookByIdController;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable long id) {
        deleteBookByIdController.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}