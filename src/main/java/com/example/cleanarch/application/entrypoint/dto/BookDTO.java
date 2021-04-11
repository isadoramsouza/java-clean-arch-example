package com.example.cleanarch.application.entrypoint.dto;


import com.example.cleanarch.data.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class BookDTO {

    long id;
    String name;
    String author;

    public static BookDTO fromBookEntity(BookEntity book){
        return BookDTO.builder().id(book.getId()).name(book.getName()).author(book.getAuthor()).build();
    }

}