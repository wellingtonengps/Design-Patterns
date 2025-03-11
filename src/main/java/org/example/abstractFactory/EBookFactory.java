package org.example.abstractFactory;

import org.example.observer.Book;
import org.example.visitor.EBook;

public class EBookFactory implements BookFactory {
    @Override
    public Book createPhysicalBook(String title, String author) {
        throw new UnsupportedOperationException("Cannot create physical book in EBookFactory");
    }

    @Override
    public Book createEBook(String title, String author) {
        return new EBook(title, author);
    }
}