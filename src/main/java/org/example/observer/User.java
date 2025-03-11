package org.example.observer;

import java.util.Observer;
import java.util.Observable;

public abstract class User implements Observer {
    private String name;
    private String notification;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void update(Observable o, Object arg) {
        this.notification = (String) arg;
    }

    public String getNotification() {
        return notification;
    }

    public abstract String getType();
}