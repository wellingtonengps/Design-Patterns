package org.example.decorator;

public class PenaltyDecorator implements FineCalculator {
    private FineCalculator calculator;

    public PenaltyDecorator(FineCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculateFine(int daysLate) {
        return calculator.calculateFine(daysLate) + 5.0; // $5 penalty
    }
}