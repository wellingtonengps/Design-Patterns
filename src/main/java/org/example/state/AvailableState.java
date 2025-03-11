package org.example.state;

import org.example.observer.Book;

public class AvailableState implements BookState {
    @Override
    public void borrow(Book book) {
        book.setState(new BorrowedState());
    }

    @Override
    public void returnBook(Book book) {
    }
}
