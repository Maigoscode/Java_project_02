package org.example;

// Project 1: Simple Calculator
//
//Step 1: Create a new Java class named "Calculator" to represent the calculator.
//
//Step 2: Define methods within the "Calculator" class to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
//
//Step 3: Implement a method to take user input for two numbers and the desired operation.
//
//Step 4: Use the input to call the corresponding method and display the result.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0.0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
