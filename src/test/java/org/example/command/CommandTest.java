package org.example.command;

import org.example.factoryMethod.CommonUser;
import org.example.observer.Book;
import org.example.observer.User;
import org.example.visitor.PhysicalBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {
    @Test
    public void testCommandPattern() {
        PhysicalBook book = new PhysicalBook("Clean Code", "Robert C. Martin");

        CommonUser user = new CommonUser("Alice");

        Command borrowCommand = new BorrowBookCommand(book, user);
        Command returnCommand = new ReturnBookCommand(book, user);

        CommandInvoker invoker = new CommandInvoker();
        invoker.executeCommand(borrowCommand);
        assertEquals("Book 'Clean Code' has been borrowed.", user.getNotification());

        invoker.executeCommand(returnCommand);
        assertEquals("Book 'Clean Code' has been returned.", user.getNotification());
    }
}