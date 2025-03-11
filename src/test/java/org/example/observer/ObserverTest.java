package org.example.observer;

import org.example.factoryMethod.CommonUser;
import org.example.visitor.PhysicalBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    @Test
    public void testObserver() {

        PhysicalBook book = new PhysicalBook("Clean Architecture", "Robert C. Martin");

        CommonUser user = new CommonUser("Alice");

        book.addObserver(user);

        book.borrow();
        assertEquals("Book 'Clean Architecture' has been borrowed.", user.getNotification());

        book.returnBook();
        assertEquals("Book 'Clean Architecture' has been returned.", user.getNotification());
    }
}