package com.roopa.learning.core.oops.exceptions;

public class TryWithMultiCatchBlockExample {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int divisor = 0;

        //int result = array[7] / divisor; // will throw ArrayIndexOutOfBoundsException and ArithmeticException.
        // To Handle this we will use try and multi-catch  block.
        // Multi catch try block is used to catch multiple exceptions .
        try {
            int result1 = array[7] / divisor;
        } catch (ArrayIndexOutOfBoundsException e) { //will catch ArrayIndexOutOfBoundsException
            System.out.println("Exception occurred " + e.getMessage());
        } catch (ArithmeticException e) { //will catch ArithmeticException
            System.out.println("Divide by zero is not allowed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Some Exception occurred: " + e.getMessage());//will catch any Generic Exception
        }
   }
}
