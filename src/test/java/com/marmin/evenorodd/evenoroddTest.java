package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class evenoroddTest{
    public evenorodd EvenOdd = new evenorodd();
    @Test
    void testEven() {
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(10); 
        assertEquals(expected, actual);
    }
    @Test
    void testOneEven() {
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(1490); 
        assertEquals(expected, actual);
    }
    @Test
    void testTwoEven() {
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(-98); 
        assertEquals(expected, actual);
    }
    @Test
    void testThreeEven() {
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(2); 
        assertEquals(expected, actual);
    }
    @Test
    void testFourEven() {
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(6786); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotEven() {
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(99); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotOneEven() {
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(3); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotTwoEven() {
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(769653); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotThreeEven() {
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(77); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotFourEven() {
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(9705); 
        assertEquals(expected, actual);
    }
    @Test
    public void testValueIsNull() {
        String x = null;
        assertNull(x); 
    }
}