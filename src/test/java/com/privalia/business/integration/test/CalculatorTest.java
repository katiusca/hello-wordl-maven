package com.privalia.business.integration.test;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    @Test
    public void testSum() {
        ICalculator calculator = new Calculator();
        assertTrue(calculator.sum(2, 3) == 5);
    }

    @Test
    public void testSubstract() {
        ICalculator calculator = new Calculator();
        assertTrue(calculator.substract(2, 2) == 0);
    }

    @Test
    public void testMultiply() {
        ICalculator calculator = new Calculator();
        assertTrue(calculator.multiply(2, 3) == 6);
    }

    @Test
    public void testDivide() {
        ICalculator calculator = new Calculator();
        assertTrue(calculator.divide(2, 2) == 1);
    }
}
