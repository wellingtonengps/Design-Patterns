package org.example.visitor;

import org.example.observer.Book;

public class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void accept(BookVisitor visitor) {
        visitor.visit(this);
    }
}