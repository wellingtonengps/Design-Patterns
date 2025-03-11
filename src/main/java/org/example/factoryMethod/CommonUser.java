package org.example.factoryMethod;

import org.example.observer.User;

public class CommonUser extends User {
    public CommonUser(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Common User";
    }
}
