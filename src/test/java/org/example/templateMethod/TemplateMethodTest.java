package org.example.templateMethod;

import org.example.factoryMethod.CommonUser;
import org.example.observer.Book;
import org.example.observer.User;
import org.example.visitor.PhysicalBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {
    @Test
    public void testPhysicalBookBorrow() {
        PhysicalBook book = new PhysicalBook("Domain-Driven Design", "Eric Evans");

        CommonUser user = new CommonUser("Bob");
        
        BookBorrowTemplate borrowTemplate = new PhysicalBookBorrow();

        borrowTemplate.borrowBook(book, user);

        assertEquals("Physical book 'Domain-Driven Design' borrowed.", user.getNotification());
    }
}