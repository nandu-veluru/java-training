package com.marmin.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogDayCareStimulatorTest {

    @Test
    void testDogDetailsArray() {
        DogDayCareStimulator d = new DogDayCareStimulator("D101", "Bruno", "Labrador", 3, "Alice");
        String[] expected = {"D101", "Bruno", "Labrador", "3", "Alice"};
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
        new DogDayCareStimulator(" ", "Bruno", "Labrador", 3, "Alice"));
    }
    @Test
    void testNullId() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator(null, "Bruno", "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankName() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", " ", "Labrador", 3, "Alice"));
    }
    @Test
    void testNullName() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", null, "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankBreed() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", "Bruno", " ", 3, "Alice"));
    }
    @Test
    void testNullBreed() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", "Bruno", null, 3, "Alice"));
    }
    @Test
    void testBlankOwnerName() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", "Bruno", "Labrador", 3, " "));
    }
    @Test
    void testNullOwnerName() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", "Bruno", "Labrador", 3, null));
    }
    @Test
    void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () ->
        new DogDayCareStimulator("D101", "Bruno", "Labrador", -1, "Alice"));
    }
    @Test
    void testRegisterDog() {
        DaycareService service = new DaycareService(5, 1, 15);
        DogDayCareStimulator dog = new DogDayCareStimulator("D101", "Bruno", "Labrador", 3, "Alice");
        service.registerDog(dog);
        assertEquals(1, service.getDogCount());
        assertEquals("Bruno", service.findDogById("D101").getName());
    }
    @Test
    void testRegisterNullDog() {
        DaycareService service = new DaycareService(5, 1, 15);
        assertThrows(IllegalArgumentException.class, () -> service.registerDog(null));
    }
    @Test
    void testDuplicateDogId() {
        DaycareService service = new DaycareService(5, 1, 15);
        service.registerDog(new DogDayCareStimulator("D101", "Bruno", "Labrador", 3, "Alice"));
        assertThrows(IllegalArgumentException.class, () -> service.registerDog(
                    new DogDayCareStimulator("D101", "Max", "Beagle", 2, "Bob")));
        assertEquals(1, service.getDogCount());
    }

}
