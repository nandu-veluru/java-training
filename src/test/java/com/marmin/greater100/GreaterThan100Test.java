package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;


class GreaterThan100Test {
    public GreaterThan100 rike = new GreaterThan100();
    Random random = new Random();
    int randomNumber;

    @Test
    void testShouldReturnTrueForNumberGreaterThan100() {
        randomNumber = random.nextInt(101, Integer.MAX_VALUE);
        boolean expected = true;
        boolean actual = rike.isGreater(randomNumber); 
        assertEquals(expected, actual);
    }
    @Test
    void testShouldReturnFalseForNumberLesserThan100() {
        randomNumber = random.nextInt(Integer.MIN_VALUE, 100);
        boolean expected = false;
        boolean actual = rike.isGreater(randomNumber); 
        assertEquals(expected, actual);
    }
}
