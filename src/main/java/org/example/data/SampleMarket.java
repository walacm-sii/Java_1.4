package org.example.data;

import org.example.car_classes.Country;

import java.util.List;
import org.example.data.SampleCountry;

public enum SampleMarket {

    BUSINESS("business", List.of('P', 'D', 'N')),
    CARGO("cargo", List.of('P', 'D', 'N', 'K')),
    TRANSPORT("transport", List.of('P', 'C', 'N')),
    TAXI("taxi", List.of('P', 'D', 'N', 'K', 'C')),
    BUS("bus", List.of('P', 'C', 'N', 'K'));
    private String name;
    private List<Character> countries;

    SampleMarket(String name, List<Character> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Character> getCountries() {
        return countries;
    }
}
