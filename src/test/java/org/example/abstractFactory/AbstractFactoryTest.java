package org.example.abstractFactory;

import org.example.observer.Book;
import org.example.visitor.EBook;
import org.example.visitor.PhysicalBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {
    @Test
    public void testPhysicalBookFactory() {
        BookFactory factory = new PhysicalBookFactory();
        Book book = factory.createPhysicalBook("Clean Code", "Robert C. Martin");
        assertTrue(book instanceof PhysicalBook);
        assertEquals("Clean Code", book.getTitle());
    }

    @Test
    public void testEBookFactory() {
        BookFactory factory = new EBookFactory();
        Book book = factory.createEBook("Design Patterns", "Erich Gamma");
        assertTrue(book instanceof EBook);
        assertEquals("Design Patterns", book.getTitle());
    }
}