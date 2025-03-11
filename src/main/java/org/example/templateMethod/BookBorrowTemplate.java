package org.example.templateMethod;

import org.example.observer.Book;
import org.example.observer.User;

public abstract class BookBorrowTemplate {
    public final void borrowBook(Book book, User user) {
        checkAvailability(book);
        updateInventory(book);
        notifyUser(user, book);
    }

    protected abstract void checkAvailability(Book book);
    protected abstract void updateInventory(Book book);
    protected abstract void notifyUser(User user, Book book);
}