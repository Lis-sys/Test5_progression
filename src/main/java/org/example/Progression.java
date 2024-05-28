package org.example;

public abstract class Progression {
    protected double firstTerm;

    public Progression(double firstTerm) {
        this.firstTerm = firstTerm;
    }

    public abstract double calculateSum(int numberOfElements);
}
