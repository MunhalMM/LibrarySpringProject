package org.telran.library.project.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private int id;
    private String name;
    private String authorName;
    private int issueYear;

    public Book() {
    }

    public Book(int id, String name, String authorName, int issueYear) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.issueYear = issueYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }
}
