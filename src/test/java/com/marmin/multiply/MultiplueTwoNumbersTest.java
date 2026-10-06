package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MultipleTwoNumbersTest {
    public MultipleTwoNumbers multiply = new MultipleTwoNumbers();

    @Test
    void testMultiplyEqual() {
        int expected = 9;
        int actual = multiply.multiply(3, 3);
        assertEquals(expected, actual);
    }
    @Test
    void testMultiplyOneEqual() {
        int expected = -30;
        int actual = multiply.multiply(3, -10);
        assertEquals(expected, actual);
    }
    @Test
    void testMultiplyTwoEqual() {
        int expected = 54;
        int actual = multiply.multiply(6, 9);
        assertEquals(expected, actual);
    }
    @Test
    void testMultiplyThreeEqual() {
        int expected = 624;
        int actual = multiply.multiply(24, 26);
        assertEquals(expected, actual);
    }
    @Test
    void testMultiplyFourEqual() {
        int expected = -378;
        int actual = multiply.multiply(63, -6);
        assertEquals(expected, actual);
    }
    @Test
    void testMultiplyNotEqual() {
        int expected = 100;
        int actual = multiply.multiply(10, 4);
        assertNotEquals(expected, actual);
    }
    @Test
    void testMultiplyOneNotEqual() {
        int expected = 100;
        int actual = multiply.multiply(10, 4);
        assertNotEquals(expected, actual);
    }
    @Test
    void testMultiplyTwoNotEqual() {
        int expected = 378;
        int actual = multiply.multiply(63, -6);
        assertNotEquals(expected, actual);
    }
    @Test
    void testMultiplyThreeNotEqual() {
        int expected = 987;
        int actual = multiply.multiply(-90, 9);
        assertNotEquals(expected, actual);
    }
    @Test
    public void testValueIsNull() {
        String x = null;
        assertNull(x); 
    }
    // @Test
    // public void testValueIsNotNull() {
    //     String x = multiply.multiply( );
    //     assertNotNull(x); 
    // }
}