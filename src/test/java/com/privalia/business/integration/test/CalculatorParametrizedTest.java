package com.privalia.business.integration.test;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
    @Test
    @Parameters({"0,0,0","1,1,2"})
    public void shouldReturnCorrectSum(int first, int second, int expectedSum){
        ICalculator calculator = new Calculator();
        int actualSum = calculator.sum(first, second);
        assertTrue(actualSum== expectedSum);
    }

    @Test
    @Parameters({"4,2,2","4,1,3"})
    public void shouldReturnCorrectSubstract(int first, int second, int expectedSubstract){
        ICalculator calculator = new Calculator();
        int actualSubstract = calculator.substract(first, second);
        assertTrue(actualSubstract== expectedSubstract);
    }

    @Test
    @Parameters({"4,6,24","3,5,15"})
    public void shouldReturnCorrectMultiply(int first, int second, int expectedMultiply){
        ICalculator calculator = new Calculator();
        int actualMultyply = calculator.multiply(first, second);
        assertTrue(actualMultyply== expectedMultiply);
    }

    @Test
    @Parameters({"2,2,1","6,2,3"})
    public void shouldReturnCorrectDivide(int first, int second, int expectedDivide){
        ICalculator calculator = new Calculator();
        int actualDivide = calculator.divide(first, second);
        assertTrue(actualDivide== expectedDivide);
    }
}
