package com.qa.automation.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testSquareAreaAndPerimeter() {
        Square square = new Square("Green", 4);

        assertEquals(16, square.area(), 0.001);
        assertEquals(16, square.perimeter(), 0.001);
        assertEquals("Green", square.getColor());
        assertEquals(4.0, square.getSide(), 0.001);
    }
}

