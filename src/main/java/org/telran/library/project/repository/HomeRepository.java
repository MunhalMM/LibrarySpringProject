package org.telran.library.project.repository;

import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;

import java.util.List;


public interface HomeRepository {

    List<Book> getAll(User user);

    Book putBookToUserHome(User user, Book book);

    Book getBook(int bookId, User user);

    boolean removeBook(int bookId, User user);
}
