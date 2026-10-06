package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class largestnumberTest{
    public largestnumber largestNumber = new largestnumber();
    @Test
    void testLargest() {
        int expected = 20;
        int actual = largestNumber.largetsNumber(10, 20); 
        assertEquals(expected, actual);
    }
    @Test
    void testOneLargest() {
        int expected = 120;
        int actual = largestNumber.largetsNumber(99, 120); 
        assertEquals(expected, actual);
    }
    @Test
    void testTwoLargest() {
        int expected = 20;
        int actual = largestNumber.largetsNumber(10, 20); 
        assertEquals(expected, actual);
    }
    @Test
    void testThreeLargest() {
        int expected = 100;
        int actual = largestNumber.largetsNumber(-100, 100); 
        assertEquals(expected, actual);
    }
    @Test
    void testFourLargest() {
        int expected = -1;
        int actual = largestNumber.largetsNumber(-1, -10); 
        assertEquals(expected, actual);
    }
    @Test
    void testNotLargest() {
        int expected = 9;
        int actual = largestNumber.largetsNumber(9, 10);
        assertNotEquals(expected, actual);
    }
    @Test
    void testNotOneLargest() {
        int expected = 9;
        int actual = largestNumber.largetsNumber(9, 10);
        assertNotEquals(expected, actual);
    }
    @Test
    void testNotTwoLargest() {
        int expected = -98;
        int actual = largestNumber.largetsNumber(-10, -98);
        assertNotEquals(expected, actual);
    }
    @Test
    void testNotThreeLargest() {
        int expected = 98;
        int actual = largestNumber.largetsNumber(123, 98);
        assertNotEquals(expected, actual);
    }
    @Test
    void testNotFourLargest() {
        int expected = -77;
        int actual = largestNumber.largetsNumber(77, -77);
        assertNotEquals(expected, actual);
    }
}