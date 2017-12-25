package com.heff.springbootmvctutorial.controllers;

import com.heff.springbootmvctutorial.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Book Controller, to manage books
 */
@RestController
public class BookController {


    @RequestMapping(value = "/getBooks")
    public List<Book> getBooks() {

        List<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(Book.provideNewBook(1, "I Love java", "Jhon Doe"));
        listOfBooks.add(Book.provideNewBook(2, "I Love spring", "James Lee"));

        return listOfBooks;
    }

}
