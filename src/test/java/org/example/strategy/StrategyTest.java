package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {
    @Test
    public void testFixedFineStrategy() {
        FineCalculationStrategy strategy = new FixedFineStrategy();
        assertEquals(10.0, strategy.calculateFine(5), 0.01);
    }

    @Test
    public void testProgressiveFineStrategy() {
        FineCalculationStrategy strategy = new ProgressiveFineStrategy();
        assertEquals(10.0, strategy.calculateFine(5), 0.01);
    }
}