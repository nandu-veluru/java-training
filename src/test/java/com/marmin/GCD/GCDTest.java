package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

class GCDTest {
    public GCD result = new GCD();
    //Happy Test cases 
    @Test
    void testGCD_Of_56_and_98_is_14(){
         int expected = 14;
         int actual = result.GCDofNumbers(56, 98); 
         assertEquals(expected, actual);
    } 
    @Test
    void testGCD_Of_6_and_8_is_4(){
         int expected = 2;
         int actual = result.GCDofNumbers(6, 8); 
         assertEquals(expected, actual);
    } 
    @Test
    void testGCD_Of_48_and_180_is_14(){
         int expected = 12;
         int actual = result.GCDofNumbers(48, 180); 
         assertEquals(expected, actual);
    } 

    @Test
    void testGCD_Of_38_and_74_is_14(){
         int expected = 2;
         int actual = result.GCDofNumbers(38, 74); 
         assertEquals(expected, actual);
    } 
    @Test
    void testGCD_Of_144_and_988_is_14(){
        int expected = 4;
        int actual = result.GCDofNumbers(144, 988); 
        assertEquals(expected, actual);

    }
    // Identical Numbers
    @Test 
    void testGCD_of_17_and_17_Is_17() {
        int expected = 17;
        int actual = result.GCDofNumbers(17, 17); 
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_765_and_765_Is_765() {
        int expected = 765;
        int actual = result.GCDofNumbers(765, 765); 
        assertEquals(expected, actual);
    }
    
    // @Test
    // void testGCD_of_21474836_and_21474836_is_21474836() {
    //     int expected = 21474836;
    //     int actual = result.GCDofNumber(21474836, 21474836);
    //     assertEquals(expected, actual);
    // }
     
     @Test
    void testGCD_of_675478_and_675478_Is_675478() {
        int expected = 675478;
        int actual = result.GCDofNumbers(675478, 675478); 
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_0_and_0_Is_0() {
        int expected = 0;
        int actual = result.GCDofNumbers(0, 0); 
        assertEquals(expected, actual);
    }
    //Edge cases
    @Test
    void testGCD_of_2_and_negitive_1_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(2, -1);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_negitive_1_and_8_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(-1, 8);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_negitive_65_and_8_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(-65, 8);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_negitive_14_and_6_is_2(){
        int expected = 2;
        int actual = result.GCDofNumbers(-14, 6);
        assertEquals(expected, actual);
    }
    @Test 
    void testGCD_of_negitive_5642_and_negitive_9870_is_14(){
        int expected = 14;
        int actual = result.GCDofNumbers(-5642, -9870);
        assertEquals(expected, actual);
    }
    //co-primes
    @Test
    void testGCD_of_17_and_5_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(17, 5);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_23_and_17_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(17, 5);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_659_and_977_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(659, 977);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_827_and_503_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(827, 503);
        assertEquals(expected, actual);
    }
    @Test
    void testGCD_of_953_and_11_is_1(){
        int expected = 1;
        int actual = result.GCDofNumbers(953, 11);
        assertEquals(expected, actual);
    }
}