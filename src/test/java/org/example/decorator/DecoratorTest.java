package org.example.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    public void testBaseFineCalculator() {
        FineCalculator calculator = new BaseFineCalculator();
        assertEquals(10.0, calculator.calculateFine(10), 0.01);
    }

    @Test
    public void testDiscountDecorator() {
        FineCalculator calculator = new DiscountDecorator(new BaseFineCalculator());
        assertEquals(9.0, calculator.calculateFine(10), 0.01);
    }

    @Test
    public void testPenaltyDecorator() {
        FineCalculator calculator = new PenaltyDecorator(new BaseFineCalculator());
        assertEquals(15.0, calculator.calculateFine(10), 0.01);
    }
}