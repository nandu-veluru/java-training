package com.marmin.app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class jsonWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Dog ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Dog Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Breed: ");
        String breed = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Owner Name: ");
        String owner = scanner.nextLine();

        JSONObject dogCare = new JSONObject();

        dogCare.put("Id", id);
        dogCare.put("Name", name);
        dogCare.put("Breed", breed);
        dogCare.put("Age", age);
        dogCare.put("Owner Name", owner);

        try (FileWriter writer = new FileWriter("DogCare.json", true)) {

            writer.write(dogCare.toJSONString());
            writer.write(System.lineSeparator());
            System.out.println("Dog details saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}