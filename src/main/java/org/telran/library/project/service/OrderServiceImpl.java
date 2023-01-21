package org.telran.library.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;
import org.telran.library.project.repository.HomeRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public List<Book> allBooksByUser(User user) {
        return homeRepository.getAll(user);
    }

    @Override
    public Book putBookToUserHome(User user, Book book) {
        return homeRepository.putBookToUserHome(user, book);
    }

    @Override
    public boolean removeBook(int bookId, User user) {
        return homeRepository.removeBook(bookId, user);
    }
}
