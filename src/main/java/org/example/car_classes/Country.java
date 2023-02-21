package org.example.car_classes;

import org.example.data.SampleCountry;

public class Country {

    private String countryName;

    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public char getCountrySign() {
        return countrySign;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", countryName, countrySign);
    }
}
