package org.telran.library.project.repository;

import org.springframework.stereotype.Repository;
import org.telran.library.project.model.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private List<Book> bookList = new ArrayList<>();

    private void init() {
        bookList.add(new Book(1, "One", "Author One", 2002));
        bookList.add(new Book(2, "Two", "Author Two", 2012));
        bookList.add(new Book(3, "Three", "Author Three", 1990));
        bookList.add(new Book(4, "Four", "Author Four", 1760));
        bookList.add(new Book(5, "Five", "Author Five", 1810));
        bookList.add(new Book(6, "Six", "Author Six", 1901));
        bookList.add(new Book(7, "Seven", "Author Seven", 2019));
    }


    public BookRepositoryImpl() {
        init();
    }

    @Override
    public List<Book> getAll() {
        return bookList;
    }

    @Override
    public Book getBook(int id) {
        return bookList.stream().filter(book -> book.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public void removeBook(Book book) {
        bookList.remove(book);
    }
}

