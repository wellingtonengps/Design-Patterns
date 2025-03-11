package org.example.abstractFactory;

import org.example.observer.Book;

public interface BookFactory {
    Book createPhysicalBook(String title, String author);
    Book createEBook(String title, String author);
}