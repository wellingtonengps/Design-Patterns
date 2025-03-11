package org.example.templateMethod;

import org.example.observer.Book;
import org.example.observer.User;

public class PhysicalBookBorrow extends BookBorrowTemplate {
    @Override
    protected void checkAvailability(Book book) {
        // Simulate availability check
    }

    @Override
    protected void updateInventory(Book book) {
        // Simulate inventory update
    }

    @Override
    protected void notifyUser(User user, Book book) {
        user.update(null, "Physical book '" + book.getTitle() + "' borrowed.");
    }
}