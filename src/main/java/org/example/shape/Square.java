package org.example.shape;

public class Square implements Shape {
    private final float sideLength;

    public Square(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float calculateSurface() {
        return sideLength * sideLength;
    }
}
