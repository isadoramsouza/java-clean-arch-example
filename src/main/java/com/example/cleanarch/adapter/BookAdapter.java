package com.example.cleanarch.adapter;


import com.example.cleanarch.core.dto.BookDTO;
import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.data.entity.BookEntity;

public class BookAdapter {

    public static Book toBook(BookDTO bookDTO){
        return Book.builder().id(bookDTO.getId()).name(bookDTO.getName()).author(bookDTO.getAuthor()).build();
    }

    public static BookDTO toBookDTO(Book book){
        return BookDTO.builder().id(book.getId()).name(book.getName()).author(book.getAuthor()).build();
    }

    public static Book toBook(BookEntity bookEntity){
        return Book.builder().id(bookEntity.getId()).name(bookEntity.getName()).author(bookEntity.getAuthor()).build();
    }

    public static BookEntity toBookEntity(Book book){
        return BookEntity.builder().id(book.getId()).name(book.getName()).author(book.getAuthor()).build();
    }

}