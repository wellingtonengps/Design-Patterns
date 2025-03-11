package org.example.visitor;

public interface BookVisitor {
    void visit(PhysicalBook book);
    void visit(EBook book);
}
