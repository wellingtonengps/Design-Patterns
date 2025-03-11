package org.example.state;

import org.example.observer.Book;

public interface BookState {
    void borrow(Book book);
    void returnBook(Book book);
}