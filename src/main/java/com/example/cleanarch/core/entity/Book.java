package com.example.cleanarch.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Book {

    long id;
    String name;
    String author;
}
