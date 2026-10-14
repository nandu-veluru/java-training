package com.marmin.app;

import java.util.ArrayList;
import java.util.List;

class Dog {
    private String id;
    private String name;
    private String breed;
    private int age;
    private String owner_name;
    protected boolean checkedIn;

    public Dog(String id, String name, String breed, int age, String owner_name) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("ID cannot be blank");
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Dog name cannot be blank");
        if (breed == null || breed.trim().isEmpty())
            throw new IllegalArgumentException("Dog breed cannot be blank");
        if (owner_name == null || owner_name.trim().isEmpty())
            throw new IllegalArgumentException("Owner name cannot be blank");
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
        this.id = id.trim();
        this.name = name.trim();
        this.breed = breed.trim();
        this.age = age;
        this.owner_name = owner_name.trim();
        this.checkedIn = false;
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
    public String display() {
        return "Dog ID: " + id
                + ", Name: " + name
                + ", Breed: " + breed
                + ", Age: " + age
                + ", Owner: " + owner_name;
    }
    public boolean isCheckedIn() {
        return checkedIn;
    }
}
public class DogDayCareStimulator extends Dog {
    public DogDayCareStimulator(String id, String name, String breed, int age, String owner_name) {
        super(id, name, breed, age, owner_name);
    }
}
class DaycareService {       
    private List<DogDayCareStimulator> dogs = new ArrayList<>();
    private int maximumOccupancy;
    private int minimumAge;
    private int maximumAge;

    public DaycareService(int maximumOccupancy, int minimumAge, int maximumAge) {
        if (getDogCount() > maximumOccupancy) {
            throw new IllegalArgumentException("Maximum occupancy must be positive");
        }
        if (minimumAge < 0 || maximumAge < minimumAge) {
            throw new IllegalArgumentException("Invalid age policy");
        }
        this.maximumOccupancy = maximumOccupancy;
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
    }
    public void registerDog(DogDayCareStimulator dog) {
        if (dog == null)
            throw new IllegalArgumentException("Dog cannot be null");
        if (findDogById(dog.getId()) != null)
            throw new IllegalArgumentException("Duplicate dog ID: " + dog.getId());
        dogs.add(dog);
    }
    public DogDayCareStimulator findDogById(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("ID cannot be blank");
        for (DogDayCareStimulator dog : dogs) {
            if (dog.getId().equals(id.trim()))
                return dog;
        }
        return null;
    }
    public void checkInDog(String id) {
        DogDayCareStimulator dog = findDogById(id);
        if (dog == null)
            throw new IllegalArgumentException("Dog not found");
        if (dog.checkedIn)
            throw new IllegalArgumentException("Dog is already checked in");
        dog.checkedIn = true;
    }

    public void checkOutDog(String id) {
        DogDayCareStimulator dog = findDogById(id);
        if (dog == null)
            throw new IllegalArgumentException("Dog not found");
        if (!dog.checkedIn)
            throw new IllegalArgumentException("Dog is already checked out");
        dog.checkedIn = false;
    }
    public List<DogDayCareStimulator> listCheckedIn() {
        List<DogDayCareStimulator> checkedInDogs = new ArrayList<>();
        for (DogDayCareStimulator dog : dogs) {
            if (dog.checkedIn)
                checkedInDogs.add(dog);
        }
        return checkedInDogs;
    }
    public List<DogDayCareStimulator> getAllDogs() {
        return new ArrayList<>(dogs);
    }
    public int getDogCount() {
        return dogs.size();
    }
}
