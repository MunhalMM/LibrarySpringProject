package org.telran.library.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.telran.library.project.model.Book;
import org.telran.library.project.service.BookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    public List<Book> getAll() {
        return bookService.getAll();
    }

    public Book getBook(int id) {
        return bookService.getBook(id);
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public void deleteBookFromLibrary(Book book) {
        bookService.remove(book);
    }

}
