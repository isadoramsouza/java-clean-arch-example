package com.example.cleanarch.data.repository;

import com.example.cleanarch.data.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookRepository extends JpaRepository<BookEntity, Long> {

}