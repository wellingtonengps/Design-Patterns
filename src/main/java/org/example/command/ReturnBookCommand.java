package org.example.command;

import org.example.observer.Book;
import org.example.observer.User;

public class ReturnBookCommand implements Command {
    private Book book;
    private User user;

    public ReturnBookCommand(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    @Override
    public void execute() {
        book.returnBook();
        user.update(null, "Book '" + book.getTitle() + "' has been returned.");
    }
}