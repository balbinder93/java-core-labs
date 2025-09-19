package com.qa.automation.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testTriangleAreaAndPerimeter() {
        Triangle t = new Triangle("Yellow", 3, 4, 5);

        assertEquals(12, t.perimeter(), 0.001);
        assertEquals(6, t.area(), 0.001);  // classic 3-4-5 right triangle
        assertEquals("Yellow", t.getColor());
    }

    @Test
    void testInvalidTriangleThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new Triangle("Red", 1, 2, 3));
    }
}

