package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareLessThanZero() {
        Calculator calculator = new Calculator();
        int c = -3;
        int squareResult = calculator.square(c);
        assertEquals(9, squareResult);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int c = 0;
        int squareResult = calculator.square(c);
        assertEquals(0, squareResult);
    }

    @Test
    public void testSquareGreaterThanZero() {
        Calculator calculator = new Calculator();
        int c = 7;
        int squareResult = calculator.square(c);
        assertEquals(49, squareResult);
    }
}
