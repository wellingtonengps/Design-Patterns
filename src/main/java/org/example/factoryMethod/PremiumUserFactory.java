package org.example.factoryMethod;

import org.example.observer.User;

public class PremiumUserFactory implements UserFactory {
    @Override
    public User createUser(String name, String type) {
        return new PremiumUser(name);
    }
}
