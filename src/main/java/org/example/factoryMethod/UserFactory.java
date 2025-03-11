package org.example.factoryMethod;

import org.example.observer.User;

public interface UserFactory {
    User createUser(String name, String type);
}