package org.example.data;

public enum SampleDimension {
    DIMENSION_1(75, 145, 240),
    DIMENSION_2(75, 145, 320),
    DIMENSION_3(75, 145, 200),
    DIMENSION_4(80, 145, 340),
    DIMENSION_5(90, 145, 240),
    DIMENSION_6(110, 145, 240),
    DIMENSION_7(75, 155, 340),
    DIMENSION_8(75, 165, 340),
    DIMENSION_9(75, 175, 360),
    DIMENSION_10(95, 145, 320);

    private int high;
    private int width;
    private int trunkCapacity;

    SampleDimension(int high, int width, int trunkCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}
