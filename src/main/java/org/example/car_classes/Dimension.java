package org.example.car_classes;

public class Dimension {
    private int high;
    private int width;
    private int trunkCapacity;

    public Dimension(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String toString() {
        return String.format("[h: %d, w: %d, tC: %d]", high, width, trunkCapacity);
    }
}
