package com.qa.automation.core;

public class Triangle extends Shape {

    private final double a;
    private final double b;


    private final double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
