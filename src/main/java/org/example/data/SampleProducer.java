package org.example.data;

public enum SampleProducer {

    TOYOTA_COROLLA("Toyota", "Corolla"),
    MCLAREN_F1("McLaren", "F1"),
    FERRARI_F8("Ferrari", "F8"),
    FERRARI_ROMA("Ferrari", "Roma"),
    BMW_I7("BMW", "i7"),
    BMW_I4("BMW", "i4"),
    BMW_I3("BMW", "i3"),
    BMW_IX("BMW", "iX"),
    FIAT_PUNTO("Fiat", "Punto"),
    FIAT_126P("Fiat", "126P");

    private String model;
    private String type;

    SampleProducer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
}
