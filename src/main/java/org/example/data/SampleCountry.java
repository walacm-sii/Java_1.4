package org.example.data;

public enum SampleCountry {
    POLAND("Poland", 'P'),
    GERMANY("Germany", 'D'),
    CHINA("China", 'C'),
    NETHERLANDS("Netherlands", 'N'),
    KOREA("Korea", 'K');

    private final String name;
    private final char sign;

    SampleCountry(String name, char sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName(){
        return name;
    }

    public char getSign() {
        return sign;
    }
}
