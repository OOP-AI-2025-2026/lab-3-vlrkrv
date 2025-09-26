package org.example.task2;

public final class Box {
    private double length;
    private double width;
    private double height;
    public Box(double length, double width, double height) {
        setDimensions(length, width, height);
    }
    private void setDimensions(double length, double width, double height) {
        if (length <= 0) {
            throw new IllegalArgumentException("length positive number");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("width positive number");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height positive number");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }
    public double getVolume() {
        return length * width * height;
    }
}
