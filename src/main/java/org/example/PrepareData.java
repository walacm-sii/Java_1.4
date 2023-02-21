package org.example;
import org.example.car_classes.*;
import org.example.data.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PrepareData {

    private static final Random random = new Random();

    public static List<Car> generateRandomCars(int numberOfCars) {
        List<Country> countries = PrepareData.prepareCountries();
        List<Market> markets = PrepareData.prepareMarkets(countries);
        List<Producer> producers = PrepareData.prepareProducers();
        List<Dimension> dimensions = PrepareData.prepareDimensions();
        List<Segment> segments = Arrays.stream(Segment.values()).toList();

        List<Car> listOfCars = new ArrayList<>();
        for(int i = 0; i < numberOfCars; i++) {
            listOfCars.add(new Car(
                    (Producer) getRandomObject(producers),
                    getRandomBoolean(),
                    (Market) getRandomObject(markets),
                    getRandomObject(segments).toString(),
                    getRandomDimensions(dimensions)
                    ));
        }

        return listOfCars;
    }

    private static <T> Object getRandomObject(List<T> listOfObjects) {
        return listOfObjects.get(random.nextInt(listOfObjects.size()));
    }

    private static boolean getRandomBoolean() {
        return random.nextInt(2) == 1;
    }

    private static List<Dimension> getRandomDimensions(List<Dimension> dimensions) {
        int numberOfDimensions = random.nextInt(5) + 1;
        List<Dimension> selectedDimensions = new ArrayList<>();
        for(int i = 0; i < numberOfDimensions; i++) {
            while(true) {
                Dimension newDimension = (Dimension) getRandomObject(dimensions);
                if(!selectedDimensions.contains(newDimension)) {
                    selectedDimensions.add(newDimension);
                    break;
                }
            }
        }
        return selectedDimensions;
    }

    public static List<Country> prepareCountries() {
        return Arrays.stream(SampleCountry.values()).map(country -> new Country(country.getName(), country.getSign())).collect(Collectors.toList());
    }

    public static List<Market> prepareMarkets(List<Country> countries) {
        return Arrays.stream(SampleMarket.values()).map(market -> new Market(market.getName(), returnCountries(market.getCountries(), countries))).collect(Collectors.toList());
    }

    public static List<Producer> prepareProducers() {
        return Arrays.stream(SampleProducer.values()).map(producer -> new Producer(producer.getModel(), producer.getType())).collect(Collectors.toList());
    }

    public static List<Dimension> prepareDimensions() {
        return Arrays.stream(SampleDimension.values()).map(dimension -> new Dimension(dimension.getHigh(), dimension.getWidth(), dimension.getTrunkCapacity())).collect(Collectors.toList());
    }
    private static List<Country> returnCountries(List<Character> availableCountries, List<Country> countries) {
        return countries.stream().filter(x -> availableCountries.contains(x.getCountrySign())).collect(Collectors.toList());
    }
}
