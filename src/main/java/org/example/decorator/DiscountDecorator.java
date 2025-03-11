package org.example.decorator;

public class DiscountDecorator implements FineCalculator {
    private FineCalculator calculator;

    public DiscountDecorator(FineCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double calculateFine(int daysLate) {
        return calculator.calculateFine(daysLate) * 0.9; // 10% discount
    }
}