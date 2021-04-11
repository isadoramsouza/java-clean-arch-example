package com.example.cleanarch.data.adapter;


import com.example.cleanarch.core.entity.Book;
import com.example.cleanarch.data.entity.BookEntity;

public class BookAdapter {

    public static Book fromBusinessEntity(BookEntity bookEntity){
        return Book.builder().id(bookEntity.getId()).name(bookEntity.getName()).author(bookEntity.getAuthor()).build();
    }

}