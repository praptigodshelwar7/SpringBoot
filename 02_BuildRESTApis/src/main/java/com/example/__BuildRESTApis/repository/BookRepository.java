package com.example.__BuildRESTApis.repository;

import com.example.__BuildRESTApis.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String title);
}
