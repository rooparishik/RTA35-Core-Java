package com.roopa.learning.core.oops.exceptions;

public class FinallyBlockExample {

    public static void main(String[] args) {

        try {
            int num = 10;
            int divisor = 0;
            int result = num / divisor;
            //System.exit(0);
            return;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed");
        }


    }

}
// Finally block is always executed whether the exception is occurred or not.
// In the above example, we are trying to divide a number by zero.
// This will throw an ArithmeticException.
// The exception is caught in the catch block and the message is printed.
// Finally block is executed after the try-catch block.

// If we use System.exit(0)  in the try block, then the finally block is not executed.
// If we use return in the try block, even then the finally block is executed.

// If Exception is not occurred, then also finally block is executed.
// In the above example, we are trying to divide a number by 2.
// This will not throw an exception.
// Still The finally block is executed after the try block.

// Finally block is used to close the resources like database connection, file, etc.
// Finally block is used to execute the cleanup code.
// Finally block can be used with or without catch block .
