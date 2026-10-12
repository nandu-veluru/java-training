package com.marmin.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogDayCareStimulatorTest {

    @Test
    void testDogDetailsArray() {
        DogDayCareStimulator d =
            new DogDayCareStimulator(
                "D101", "Bruno", "Labrador", 3, "Alice");
        String[] expected = {
            "D101", "Bruno", "Labrador", "3", "Alice"
        };
        String[] actual = {
            d.getId(),
            d.getName(),
            d.getBreed(),
            String.valueOf(d.getAge()),
            d.getOwnerName()
        };

        assertArrayEquals(expected, actual);
    }
    @Test
    void testBlankId() {
        assertThrows(IllegalArgumentException.class, () ->
            new DogDayCareStimulator(
                " ", "Bruno", "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankName() {
        assertThrows(IllegalArgumentException.class, () ->
            new DogDayCareStimulator(
                "D101", " ", "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankBreed() {
        assertThrows(IllegalArgumentException.class, () ->
            new DogDayCareStimulator(
                "D101", "Bruno", " ", 3, "Alice"));
    }
    @Test
    void testBlankOwnerName() {
        assertThrows(IllegalArgumentException.class, () ->
            new DogDayCareStimulator(
                "D101", "Bruno", "Labrador", 3, " "));
    }
    @Test
    void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () ->
            new DogDayCareStimulator(
                "D101", "Bruno", "Labrador", -1, "Alice"));
    }
    
}