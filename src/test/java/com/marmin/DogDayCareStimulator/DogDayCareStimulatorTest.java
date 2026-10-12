package com.marmin.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogDayCareStimulatorTest {
    private DogDayCareStimulator.DaycareService service;
    @BeforeEach
    void setUp() {
        service = new DogDayCareStimulator.DaycareService();
    }
    private DogDayCareStimulator createDog() {
        return new DogDayCareStimulator(
                "D101", "Bruno", "Labrador", 3, "Alice");
    }
    @Test
    void testDogDetails() {
        DogDayCareStimulator dog = createDog();

        assertEquals("D101", dog.getId());
        assertEquals("Bruno", dog.getName());
        assertEquals("Labrador", dog.getBreed());
        assertEquals(3, dog.getAge());
        assertEquals("Alice", dog.getOwnerName());
    }
    @Test
    void testValidInputIsTrimmed() {
        DogDayCareStimulator dog =
                new DogDayCareStimulator(
                        " D101 ", " Bruno ", " Labrador ",
                        3, " Alice ");

        assertEquals("D101", dog.getId());
        assertEquals("Bruno", dog.getName());
        assertEquals("Labrador", dog.getBreed());
        assertEquals("Alice", dog.getOwnerName());
    }
    @Test
    void testNullIdRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        null, "Bruno", "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankIdRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        " ", "Bruno", "Labrador", 3, "Alice"));
    }
    @Test
    void testBlankNameRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        "D101", " ", "Labrador", 3, "Alice"));
    }

    @Test
    void testBlankBreedRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        "D101", "Bruno", "", 3, "Alice"));
    }
    @Test
    void testBlankOwnerRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        "D101", "Bruno", "Labrador", 3, " "));
    }

    @Test
    void testNegativeAgeRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new DogDayCareStimulator(
                        "D101", "Bruno", "Labrador", -1, "Alice"));
    }
    @Test
    void testZeroAgeAccepted() {
        assertEquals(0, createDogWithAgeZero().getAge());
    }

    private DogDayCareStimulator createDogWithAgeZero() {
        return new DogDayCareStimulator(
                "D102", "Max", "Beagle", 0, "Bob");
    }
    @Test
    void testRegisterDog() {
        service.registerDog(createDog());

        assertEquals(1, service.getDogCount());
    }
    @Test
    void testDuplicateIdRejected() {
        service.registerDog(createDog());
        DogDayCareStimulator duplicate =
                new DogDayCareStimulator(
                        "D101", "Max", "Beagle", 2, "Bob");

        assertThrows(IllegalArgumentException.class,
                () -> service.registerDog(duplicate));

        assertEquals(1, service.getDogCount());
    }

    @Test
    void testNullDogRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> service.registerDog(null));

        assertEquals(0, service.getDogCount());
    }

    @Test
    void testFindExistingDog() {
        service.registerDog(createDog());

        assertEquals("Bruno",
                service.findDogById("D101").getName());
    }

    @Test
    void testFindMissingDog() {
        assertNull(service.findDogById("D999"));
    }

    @Test
    void testBlankSearchIdRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> service.findDogById(" "));
    }

    @Test
    void testListAllDogs() {
        service.registerDog(createDog());
        service.registerDog(createDogWithAgeZero());

        assertEquals(2, service.getAllDogs().size());
    }

    @Test
    void testReturnedListCannotChangeStoredDogs() {
        service.registerDog(createDog());

        service.getAllDogs().clear();

        assertEquals(1, service.getDogCount());
    }
}