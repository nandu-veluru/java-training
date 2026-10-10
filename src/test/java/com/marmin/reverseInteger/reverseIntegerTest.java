package com.marmin.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
//import org.apache.commons.lang3.ArrayUtils;

class reverseIntegerTest{
    public reverseInteger Revesre = new reverseInteger();
    @Test
    void testReveseArrayOfIntegers(){
         int[] data = {432, 687, 876, 4567, 2571324, 9095};
         int[] expected = {234, 786, 678, 7654, 4231752, 5909};
         int[] actual = Revesre.integer_reverse(data);
         assertArrayEquals(expected, actual);
    }
    @Test
    void testReveseArrayOfNegitiveNumbers(){
         int[] data = {-65, -287, -7435, -7667, -3245, -865674};
         int[] expected = {-56, -782, -5347, -7667, -5423, -476568};
         int[] actual = Revesre.integer_reverse(data);
         assertArrayEquals(expected, actual);
    } 
    @Test 
    void testReveseArrayForSameNumberAreUnchaged() {
        int[] data = {111, 44444, 999999, 666666, 0000000, 777777, 888888};
        int[] expected = {111, 44444, 999999, 666666, 0000000, 777777, 888888};
        int[] actual = Revesre.integer_reverse(data);
        assertArrayEquals(expected, actual);

    }

}