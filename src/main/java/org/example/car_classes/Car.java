package org.example.car_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    private Producer producer;

    private boolean isAutomaticGear;

    private Market market;

    private String segment; //standard, medium, premium

    private List<Dimension> dimensions;

    private static List<Car> cars = new ArrayList<>();

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, List<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
        cars.add(this);
    }

    public static void displayFilteredCars(String requiredProducer, boolean requiredAutomaticGear, int requiredTrunkCapacity) {
        List<Car> filteredCars;
        filteredCars = cars.stream().filter(car -> car.isAutomaticGear == requiredAutomaticGear
                && requiredProducer.equals(car.producer.getModel())
                && car.dimensions.stream().anyMatch(dimension -> dimension.getTrunkCapacity() >= requiredTrunkCapacity)).collect(Collectors.toList());

        filteredCars.forEach(car -> System.out.println(car.toString()));

        System.out.println("Market that meets the given criteria:");
        filteredCars.stream().map(car -> car.market.getCountries()).flatMap(List::stream)
                .collect(Collectors.toSet()).forEach(market -> System.out.println(market.toString()));
    }

    @Override
    public String toString() {
        return String.format("%s\nAutomatic gear: %b\n%s\nSegment: %s\nDimensions: %s\n",
                producer.toString(),
                isAutomaticGear, market.toString(), segment,
                dimensions.stream().map(Dimension::toString).collect(Collectors.joining(", ")));
    }
}
