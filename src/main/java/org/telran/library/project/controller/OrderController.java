package org.telran.library.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;
import org.telran.library.project.service.OrderService;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    public List<Book> getAll(User user) {
        return orderService.allBooksByUser(user);
    }

    public Book putBookToUserHome(User user, Book book) {
        return orderService.putBookToUserHome(user, book);
    }

    public boolean removeBookFromUser(int bookId, User user) {
        return orderService.removeBook(bookId, user);
    }
}
