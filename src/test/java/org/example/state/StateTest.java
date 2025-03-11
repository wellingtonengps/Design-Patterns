package org.example.state;

import org.example.observer.Book;
import org.example.visitor.PhysicalBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    @Test
    public void testBookState() {
        PhysicalBook book = new PhysicalBook("Refactoring", "Martin Fowler");

        assertTrue(book.getState() instanceof AvailableState);

        book.borrow();
        assertTrue(book.getState() instanceof BorrowedState);

        book.returnBook();
        assertTrue(book.getState() instanceof AvailableState);
    }
}