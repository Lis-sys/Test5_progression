package org.example;

public abstract class Progression {
    protected double firstTerm;

    public Progression(double firstTerm) {
        this.firstTerm = firstTerm;
    }

    // Метод для вычисления суммы должен быть переопределен в производных классах
    public abstract double calculateSum(int numberOfElements);
}