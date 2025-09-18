package com.qa.automation.core;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // abstract methods (subclasses must implement)
    public abstract double area();

    public abstract double perimeter();
}

