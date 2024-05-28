package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    @Test
    void calculateSum() {
        GeometricProgression ap = new GeometricProgression(2,3);
        assertEquals(242, ap.calculateSum(5), 0.001);

    }
}