package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreaterThan100Test {
    public GreaterThan100 rike = new GreaterThan100();

    @Test
    void testGreater100() {
        boolean expected = true;
        boolean actual = rike.isGreater(900); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterOne100() {
        boolean expected = true;
        boolean actual = rike.isGreater(870); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterTwo100() {
        boolean expected = true;
        boolean actual = rike.isGreater(198); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterThree100() {
        boolean expected = true;
        boolean actual = rike.isGreater(7689); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterFour100() {
        boolean expected = true;
        boolean actual = rike.isGreater(1234); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterFive100() {
        boolean expected = true;
        boolean actual = rike.isGreater(9090); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterNot100() {
        boolean expected = false;
        boolean actual = rike.isGreater(-90); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterNotone100() {
        boolean expected = false;
        boolean actual = rike.isGreater(1); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterNotTwo100() {
        boolean expected = false;
        boolean actual = rike.isGreater(99); 
        assertEquals(expected, actual);
    }
    @Test
    void testGreaterNotThree100() {
        boolean expected = false;
        boolean actual = rike.isGreater(-1); 
        assertEquals(expected, actual);
    }
    @Test
    void testConditionTrue() {
        boolean expected = true;
        boolean actual = rike.isGreater(160); 
        assertEquals(expected, actual);
    }
    @Test
    void testConditionFalse() {
        boolean expected = false;
        boolean actual = rike.isGreater(0); 
        assertEquals(expected, actual);
    }
    @Test
    public void testValueIsNull() {
        String x = null;
        assertNull(x); 
    }
}
