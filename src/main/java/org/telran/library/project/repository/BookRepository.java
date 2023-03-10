package org.telran.library.project.repository;

import org.telran.library.project.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAll();

    Book getBook(int id);

    void addBook(Book book);

    void removeBook(Book book);
}
