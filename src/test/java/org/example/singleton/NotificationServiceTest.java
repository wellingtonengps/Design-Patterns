package org.example.singleton;

import org.example.factoryMethod.CommonUser;
import org.example.observer.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    @Test
    public void testSingletonInstance() {
        NotificationService instance1 = NotificationService.getInstance();
        NotificationService instance2 = NotificationService.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testNotifyUser() {
        User user = new CommonUser("Alice");
        NotificationService service = NotificationService.getInstance();
        String message = "Your book is due tomorrow.";
        String notification = service.notifyUser(user, message);
        assertEquals("Notified user: Alice - Your book is due tomorrow.", notification);
    }
}