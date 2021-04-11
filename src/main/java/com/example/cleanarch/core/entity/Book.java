package com.example.cleanarch.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    long id;
    String name;
    String author;
}
