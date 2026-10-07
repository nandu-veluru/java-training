package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;


class evenoroddTest{
    public evenorodd EvenOdd = new evenorodd();
    int randomNum;
    @Test
    void testShouldReturnTrueForEvenNumber() {
        randomNum = (int)(Math.random() * Integer.MAX_VALUE); 
        if(randomNum % 2 != 0){
            randomNum++;
        }   
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(randomNum);
        assertEquals(expected, actual);
    }
    @Test
    void testShouldReturnFalseForOddNumber() {
        randomNum = (int)(Math.random() * Integer.MAX_VALUE); 
        if(randomNum % 2 == 0){
            randomNum++;
        }   
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(randomNum);
        assertEquals(expected, actual);
    }
    @Test
    void testShouldReturnTrueForOddNumber() {
        randomNum = (int)(Math.random() * Integer.MAX_VALUE);
        if(randomNum % 2 == 0){
            randomNum++;
        }   
        boolean expected = true;
        boolean actual = EvenOdd.isEvenOrOdd(randomNum);
        assertNotEquals(expected, actual);
    }
    @Test
    void testShouldReturnFalseForEven() {
        randomNum = (int)(Math.random() * Integer.MAX_VALUE);
        if(randomNum % 2 != 0){
            randomNum++;
        }   
        boolean expected = false;
        boolean actual = EvenOdd.isEvenOrOdd(randomNum);
        assertNotEquals(expected, actual);
    }
}


