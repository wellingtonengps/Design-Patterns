package org.example.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testVisitor {
    @Test
    public void testVisitor() {
        PhysicalBook physicalBook = new PhysicalBook("Refactoring", "Martin Fowler");
        EBook eBook = new EBook("Design Patterns", "Erich Gamma");

        ReportVisitor visitor = new ReportVisitor();
        physicalBook.accept(visitor);
        assertEquals("Report for physical book: Refactoring", visitor.getReport());

        eBook.accept(visitor);
        assertEquals("Report for e-book: Design Patterns", visitor.getReport());
    }
}