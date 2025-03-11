package org.example.factoryMethod;

import org.example.observer.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    @Test
    public void testCommonUserFactory() {
        UserFactory factory = new CommonUserFactory();
        User user = factory.createUser("John", "common");
        assertTrue(user instanceof CommonUser);
        assertEquals("Common User", user.getType());
    }

    @Test
    public void testPremiumUserFactory() {
        UserFactory factory = new PremiumUserFactory();
        User user = factory.createUser("Jane", "premium");
        assertTrue(user instanceof PremiumUser);
        assertEquals("Premium User", user.getType());
    }
}