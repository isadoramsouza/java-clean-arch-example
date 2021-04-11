package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.controller.interfaces.DeleteBookController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class DeleteBookEntryPoint {

    private final DeleteBookController deleteBookByIdController;

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete book by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Book deleted"),
            @ApiResponse(code = 404, message = "Book not deleted with id")
    })
    public ResponseEntity<Void> deleteBookById(@PathVariable long id) {
        deleteBookByIdController.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}