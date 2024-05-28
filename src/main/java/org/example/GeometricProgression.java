package org.example;
public class GeometricProgression extends Progression {
    private double commonRatio;

    public GeometricProgression(double firstTerm, double commonRatio) {
        super(firstTerm);
        this.commonRatio = commonRatio;
    }

    @Override
    public double calculateSum(int numberOfElements) {
        if (commonRatio == 1) {
            return numberOfElements * firstTerm;
        } else {
            return firstTerm * (Math.pow(commonRatio, numberOfElements) - 1) / (commonRatio - 1);
        }
    }
}