package com.roopa.learning.core.dailyassignments;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Positive Integer : ");

        int n = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
            System.out.println("The Factorial of " + n + " is:" + factorial);
        scanner.close();

    }
}
