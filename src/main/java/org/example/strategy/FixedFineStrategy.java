package org.example.strategy;

public class FixedFineStrategy implements FineCalculationStrategy {
    @Override
    public double calculateFine(int daysLate) {
        return 10.0;
    }
}