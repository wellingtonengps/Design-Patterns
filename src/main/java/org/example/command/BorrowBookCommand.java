package org.example.command;

import org.example.observer.Book;
import org.example.observer.User;

public class BorrowBookCommand implements Command {
    private Book book;
    private User user;

    public BorrowBookCommand(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    @Override
    public void execute() {
        book.borrow();
        user.update(null, "Book '" + book.getTitle() + "' has been borrowed.");
    }
}