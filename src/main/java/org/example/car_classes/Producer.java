package org.example.car_classes;

public class Producer {

    private String model;
    private String type;

    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", model, type);
    }

    public String getModel() {
        return model;
    }
}
