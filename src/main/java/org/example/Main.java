package org.example;

import org.example.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("Enter two numbers separated by a space: ");
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            float result = calculator.sum(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred, please enter valid numbers.");
        }
    }
}