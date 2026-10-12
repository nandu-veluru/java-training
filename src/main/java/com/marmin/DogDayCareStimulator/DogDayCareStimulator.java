package com.marmin.app;

import java.util.ArrayList;
import java.util.List;

public class DogDayCareStimulator {

    private String id;
    private String name;
    private String breed;
    private int age;
    private String owner_name;

    public DogDayCareStimulator(String id, String name, String breed,int age, String owner_name) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "ID cannot be blank");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Dog name cannot be blank");
        }
        if (breed == null || breed.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Dog breed cannot be blank");
        }
        if (owner_name == null || owner_name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Owner name cannot be blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.id = id.trim();
        this.name = name.trim();
        this.breed = breed.trim();
        this.age = age;
        this.owner_name = owner_name.trim();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public String getOwnerName() {
        return owner_name;
    }
    @Override
    public String toString() {
        return "Dog ID: " + id
                + ", Name: " + name
                + ", Breed: " + breed
                + ", Age: " + age
                + ", Owner: " + owner_name;
    }
    public static class DaycareService {
        private List<DogDayCareStimulator> dogs = new ArrayList<>();
        public void registerDog(DogDayCareStimulator dog) {
            if (dog == null) {
                throw new IllegalArgumentException(
                        "Dog cannot be null");
            }
            if (findDogById(dog.getId()) != null) {
                throw new IllegalArgumentException(
                        "Duplicate dog ID: " + dog.getId());
            }
            dogs.add(dog);
        }
        public DogDayCareStimulator findDogById(String id) {
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException(
                        "ID cannot be blank");
            }
            String searchId = id.trim();
            for (DogDayCareStimulator dog : dogs) {
                if (dog.getId().equals(searchId)) {
                    return dog;
                }
            }
            return null;
        }
        public List<DogDayCareStimulator> getAllDogs() {
            return new ArrayList<>(dogs);
        }
        public int getDogCount() {
            return dogs.size();
        }
    }
}