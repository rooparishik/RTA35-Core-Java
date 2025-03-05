package com.roopa.learning.core.oops.exceptions;

public class DivideByZeroExample {

    public static void main(String[] args) {

        int num = 10;
        int divisor = 0;

        //int result = num / divisor;
        // will throw ArithmeticException which is RuntimeException
        //ArithmeticException is a runtime exception that occurs when we try to divide a number by zero.
        //To handle this exception, we can use try-catch block.

        try {
            int result = num / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed: " + e.getMessage());
        }
    }
}
