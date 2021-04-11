package com.example.cleanarch.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BookDTO{

    long id;
    String name;
    String author;
}
