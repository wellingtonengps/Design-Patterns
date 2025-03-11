package org.example.factoryMethod;

import org.example.observer.User;

public class PremiumUser extends User {
    public PremiumUser(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Premium User";
    }
}