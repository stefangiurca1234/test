package org.example.shape;

public class Circle implements Shape {
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateSurface() {
        return (float) (Math.PI * radius * radius);
    }
}
