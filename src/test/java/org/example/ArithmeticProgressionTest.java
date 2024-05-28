package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {

    @Test
    void calculateSum() {
        ArithmeticProgression ap = new ArithmeticProgression(3,5);
        assertEquals(255, ap.calculateSum(10), 0.001);
    }
}