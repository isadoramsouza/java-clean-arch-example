package com.example.cleanarch.application.entrypoint;

import com.example.cleanarch.core.exception.BookNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Objects;

@ControllerAdvice
public class GlobalErrorHandler {

    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ExceptionPayload bookNotFoundException(BookNotFoundException e) {
        return ExceptionPayload.builder()
                .message(Objects.nonNull(e.getMessage()) ? e.getMessage() : "Register not found.")
                .status(HttpStatus.NOT_FOUND.value())
                .build();
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ExceptionPayload {
        private String message;
        private int status;
    }
}
