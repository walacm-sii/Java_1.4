package org.example;

import org.example.car_classes.*;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = FileHandler.loadFile("car.properties");
        PrepareData.generateRandomCars(15);

        String producer = properties.getProperty("producer");
        boolean isAutomaticGear = Boolean.parseBoolean(properties.getProperty("isAutomaticGear"));
        int minimalTrunkCapacity = Integer.parseInt(properties.getProperty("minimalTrunkCapacity"));

        Car.displayFilteredCars(producer, isAutomaticGear, minimalTrunkCapacity);
    }

}