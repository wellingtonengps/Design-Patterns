package org.example.visitor;

public class ReportVisitor implements BookVisitor {
    private String report;

    @Override
    public void visit(PhysicalBook book) {
        report = "Report for physical book: " + book.getTitle();
    }

    @Override
    public void visit(EBook book) {
        report = "Report for e-book: " + book.getTitle();
    }

    public String getReport() {
        return report;
    }
}