package org.example.decorator;

public class BaseFineCalculator implements FineCalculator {
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }
}
