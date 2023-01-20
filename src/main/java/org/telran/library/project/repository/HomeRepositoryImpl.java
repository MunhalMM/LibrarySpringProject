package org.telran.library.project.repository;

import org.telran.library.project.model.Book;
import org.telran.library.project.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeRepositoryImpl implements HomeRepository {
    private Map<User, List<Book>> homeBookList = new HashMap<>();

    @Override
    public List<Book> getAll(User user) {
        return homeBookList.getOrDefault(user, new ArrayList<>());
    }

    @Override
    public Book putBookToUserHome(User user, Book book) {
        List<Book> books = getAll(user);
        if (books.size() == 0) {
            books.add(book);
            homeBookList.put(user, books);
        } else {
            books.add(book);
        }
        return book;
    }

    @Override
    public Book getBook(int bookId, User user) {
        Book book = getAll(user).stream().filter(el -> el.getId() == bookId).findFirst().get();
        return book;
    }

    public boolean removeBook(int bookId, User user) {
        return getAll(user).remove(getBook(bookId, user));
    }
}


