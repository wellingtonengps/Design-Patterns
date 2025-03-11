package org.example.abstractFactory;

import org.example.observer.Book;
import org.example.visitor.PhysicalBook;

public class PhysicalBookFactory implements BookFactory {
    @Override
    public Book createPhysicalBook(String title, String author) {
        return new PhysicalBook(title, author);
    }

    @Override
    public Book createEBook(String title, String author) {
        throw new UnsupportedOperationException("Cannot create e-book in PhysicalBookFactory");
    }
}
