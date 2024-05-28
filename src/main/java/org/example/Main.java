package org.example;
import org.example.ArithmeticProgression;
import org.example.GeometricProgression;

public class Main {
    public static void main(String[] args) {

        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(3, 5);
        System.out.println("Сумма арифметической прогрессии: " + arithmeticProgression.calculateSum(10));


        GeometricProgression geometricProgression = new GeometricProgression(2, 3);
        System.out.println("Сумма геометрической прогрессии: " + geometricProgression.calculateSum(5));
    }
}