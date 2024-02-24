package org.example.shape;

public class Triangle implements Shape {
    private final float base;
    private final float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateSurface() {
        return (base * height) / 2;
    }
}