package org.example.sandbox.unittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected=4; //SEAT

        int actual = new Calculator().add(2,2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        int expected=6; //SEAT
        int actual = new Calculator().add(2,2,2);
        assertEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void subtract() {
        int expected=2; //SEAT

        int actual = new Calculator().subtract(4,2);

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void multiply() {
        int expected=4; //SEAT
        int actual = new Calculator().multiply(2,2);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void divide() {
        int expected=4; //SEAT
        int actual = new Calculator().divide(8,2);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            new Calculator().divide(0,0);
        });
    }
}