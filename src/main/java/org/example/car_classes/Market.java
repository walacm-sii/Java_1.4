package org.example.car_classes;

import java.util.List;
import java.util.stream.Collectors;

public class Market {
    private String name;

    public List<Country> getCountries() {
        return countries;
    }

    private List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return String.format("%s + Available in: %s", name, prepareCountriesString());
    }

    private String prepareCountriesString() {
        return countries.stream().map(Country::toString).collect(Collectors.joining(", "));
    }
}
