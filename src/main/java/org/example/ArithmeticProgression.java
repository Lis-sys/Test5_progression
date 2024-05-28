package org.example;

public class ArithmeticProgression extends Progression {
    private double commonDifference;

    public ArithmeticProgression(double firstTerm, double commonDifference) {
        super(firstTerm);
        this.commonDifference = commonDifference;
    }

    @Override
    public double calculateSum(int numberOfElements) {
        return (numberOfElements / 2.0) * (2 * firstTerm + (numberOfElements - 1) * commonDifference);
    }
}
