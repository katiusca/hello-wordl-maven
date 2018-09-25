package com.privalia.business.unit.test;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class CalculatorUnitTest {

    @Mock
    ICalculator iCalculator;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSum() {
        when(iCalculator.sum(2,3)).thenReturn(5);
        assertTrue(iCalculator.sum(2, 3) == 5);
    }

    @Test
    public void testSubstract() {
        when(iCalculator.substract(2,2)).thenReturn(0);
        assertTrue(iCalculator.substract(2, 2) == 0);
    }

    @Test
    public void testMultiply() {
        when(iCalculator.multiply(2,2)).thenReturn(4);
        assertTrue(iCalculator.multiply(2, 2) == 4);
    }

    @Test
    public void testDivide() {
        when(iCalculator.divide(2,2)).thenReturn(1);
        assertTrue(iCalculator.divide(2, 2) == 1);
    }
}
