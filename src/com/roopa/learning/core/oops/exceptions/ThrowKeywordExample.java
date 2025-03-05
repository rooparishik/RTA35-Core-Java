package com.roopa.learning.core.oops.exceptions;

public class ThrowKeywordExample {

    public static void main(String[] args) {
       try{
           checkAge(17);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
    }

    private static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible to vote - You must be at least 18 years old.");
        } else {
            System.out.println("Eligible to Vote - You are old enough!");
        }
    }
}
// In the above example, we have a method checkAge() that takes an integer parameter age.
// If the age is less than 18, then we are throwing an IllegalArgumentException.
// We are catching the IllegalArgumentException in the main method and printing the message.
// If the age is greater than or equal to 18, then the message "Eligible to Vote - You are old enough!" is printed.
// The throw keyword is used to throw an exception explicitly.
// The throw keyword is used to throw a user-defined exception or a built-in exception.
// The throw keyword is used to throw an exception from a method.
