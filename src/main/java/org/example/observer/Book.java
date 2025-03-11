package org.example.observer;

import org.example.state.AvailableState;
import org.example.state.BookState;
import org.example.visitor.BookVisitor;

import java.util.Observable;


import java.util.Observable;

public abstract class Book extends Observable {
    private String title;
    private String author;
    private BookState state;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.state = new AvailableState();
    }

    public void borrow() {
        state.borrow(this);
        setChanged();
        notifyObservers("Book '" + title + "' has been borrowed.");
    }

    public void returnBook() {
        state.returnBook(this);
        setChanged();
        notifyObservers("Book '" + title + "' has been returned.");
    }

    public void setState(BookState state) {
        this.state = state;
    }

    public BookState getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void accept(BookVisitor visitor);
}