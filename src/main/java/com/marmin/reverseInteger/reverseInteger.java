package com.marmin.app;
import java.util.Arrays;
import java.util.Collections;
//import org.apache.commons.lang3.ArrayUtils;

public class reverseInteger {

    public int integer_reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }

        return reversed;
    }

    public int[] integer_reverse(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = integer_reverse(numbers[i]);
        }
        return result;
    }
}