package com.qa.automation.core;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testCircleAreaAndPerimeter() {
        Circle circle = new Circle("Red", 10);

        assertEquals(Math.PI * 100, circle.area(), 0.001);
        assertEquals(2 * Math.PI * 10, circle.perimeter(), 0.001);
        assertEquals("Red", circle.getColor());
    }

    @Test
    void testRectangleAreaAndPerimeter() {
        Rectangle rect = new Rectangle("Blue", 5, 10);

        assertEquals(50, rect.area(), 0.001);
        assertEquals(30, rect.perimeter(), 0.001);
        assertEquals("Blue", rect.getColor());
    }
}

