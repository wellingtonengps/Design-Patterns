package org.example.strategy;

public class ProgressiveFineStrategy implements FineCalculationStrategy {
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }
}