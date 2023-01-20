package org.telran.library.project.controller;

import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;
import org.telran.library.project.service.OrderService;

import java.util.List;

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

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
