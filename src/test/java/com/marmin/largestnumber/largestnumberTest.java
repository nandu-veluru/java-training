package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class largestnumberTest{
    public largestnumber largestNumber = new largestnumber();
    @Test
    void testLargestNumberIs20() {
        int expected = 20;
        int actual = largestNumber.largetsNumber(10, 20); 
        assertEquals(expected, actual);
    }
    @Test
    void testLargestNumberIs120() {
        int expected = 120;
        int actual = largestNumber.largetsNumber(99, 120); 
        assertEquals(expected, actual);
    }
    @Test
    void testLargestNumberIs2026() {
        int expected = 2026;
        int actual = largestNumber.largetsNumber(1089, 2026); 
        assertEquals(expected, actual);
    }
    @Test
    void testLargestNumberIs100() {
        int expected = 100;
        int actual = largestNumber.largetsNumber(-100, 100); 
        assertEquals(expected, actual);
    }
    @Test
    void testLargestNUmberIsMinus1() {
        int expected = -1;
        int actual = largestNumber.largetsNumber(-1, -10); 
        assertEquals(expected, actual);
    }
    @Test
    void testLargestNumberIsNot9() {
        int expected = 9;
        int actual = largestNumber.largetsNumber(9, 10);
        assertNotEquals(expected, actual);
    }
    @Test
    void testLargestNumberIsNotNegitive98() {
        int expected = -98;
        int actual = largestNumber.largetsNumber(-10, -98);
        assertNotEquals(expected, actual);
    }
    @Test
    void testLargestNumberIsNot98() {
        int expected = 98;
        int actual = largestNumber.largetsNumber(123, 98);
        assertNotEquals(expected, actual);
    }
    @Test
    void testLargestNumberIsNotNegitive77() {
        int expected = -77;
        int actual = largestNumber.largetsNumber(77, -77);
        assertNotEquals(expected, actual);
    }
}