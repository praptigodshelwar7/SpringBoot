package com.example.__BuildRESTApis.service;

import com.example.__BuildRESTApis.entity.Book;
import com.example.__BuildRESTApis.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByName(String name) {
        return bookRepository.findBookByTitle(name);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);   //here we also have to pass the id in which we have to update or else it will add a new entry
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
