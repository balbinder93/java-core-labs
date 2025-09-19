package com.qa.automation.core;

public class Square extends Rectangle {

    private double side;

    public Square(String color, double side) {

        super(color, side, side);
        this.side = side;
    }


    public double getSide() {
        return this.side;
    }
}
