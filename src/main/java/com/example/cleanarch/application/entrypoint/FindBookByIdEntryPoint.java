package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.application.entrypoint.dto.BookDTO;
import com.example.cleanarch.controller.interfaces.FindBookByIdController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Returns book by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Book found"),
            @ApiResponse(code = 404, message = "Book not found with id")
    })
    public ResponseEntity<BookDTO> findBookById(@PathVariable long id) {
        return new ResponseEntity<>(findBookByIdController.findById(id), HttpStatus.OK);
    }
}