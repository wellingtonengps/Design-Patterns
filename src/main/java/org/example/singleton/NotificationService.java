package org.example.singleton;

import org.example.observer.User;

public class NotificationService {
    private static NotificationService instance;

    private NotificationService() {}

    public static synchronized NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public String notifyUser(User user, String message) {
        return "Notified user: " + user.getName() + " - " + message;
    }
}