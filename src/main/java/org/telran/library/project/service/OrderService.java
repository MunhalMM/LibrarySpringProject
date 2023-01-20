package org.telran.library.project.service;

import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;

import java.util.List;

public interface OrderService {
    List<Book> allBooksByUser(User user);

    Book putBookToUserHome(User user, Book book);

    boolean removeBook(int bookId, User user);


}
