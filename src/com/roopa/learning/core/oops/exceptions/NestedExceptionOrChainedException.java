package com.roopa.learning.core.oops.exceptions;

public class NestedExceptionOrChainedException {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occurred: " + e.getMessage());
            // Getting the cause of the exception
            // The getCause() method returns the cause of the exception.
            // The cause of the exception is the exception that caused the current exception.
            System.out.println("Cause of the exception: " + e.getCause().getMessage());
        }

    }
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            // Throwing a Chained or Nested Exception
            // Re-throwing the exception occurred in method2
            //
            System.out.println("Exception occurred: " + e.getMessage());
            throw new Exception("Exception occurred in method1", e);
        }
    }
    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            // Throwing a Chained or Nested Exception
            // Re-throwing the exception occurred in method3
            // We are wrapping the exception occurred in method3 with a new exception
            throw new Exception("Exception occurred in method2", e);
        }
    }
    // This method is throwing a checked exception.
    // Checked Exception is also known as a compile-time exception.
    // Since this method is throwing a checked exception,
    // we need to declare it in the method signature using throws keyword.
    // If we don't declare with throws keyword, we will get a compilation error.
    // It's mandatory to declare the checked exception in the method signature,
    // if the method is throwing a checked exception.
    // If the method is throwing a runtime exception or Unchecked Exception,
    // then we don't need to declare it in the method signature.

    public static void method3() throws Exception {
        System.out.println("Processing something very secret in method3");
        System.out.println("Exception occurred in method3");
        // Throwing Checked Exception
        throw new Exception("Exception occurred in method3");
    }
}
