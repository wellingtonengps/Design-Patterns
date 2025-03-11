package org.example.state;

import org.example.observer.Book;

public class BorrowedState implements BookState {
    @Override
    public void borrow(Book book) {
    }

    @Override
    public void returnBook(Book book) {
        book.setState(new AvailableState());
    }
}