package com.roopa.learning.core.oops.exceptions.realtimeexamples;
// Checked Exception is created by extending Exception class.
// Checked Exception is also known as Compile Time Exception.
// Custom Exception is created by extending Exception class.
// Custom Exception is also known as User Defined Exception.
// Custom Exception is used to create our own exception.
// Custom Exception is used to handle the exception in our own way.
// Custom Exception is used to create an exception that is not available in Java.
// In the below example, we have a UserAuthentication class.

class TooManyFailedAttemptsException extends Exception {
    public TooManyFailedAttemptsException(String message) {
        super(message);
    }
}


public class UserAuthentication {
    private static int failedAttempts = 0;

    private static void  login(final String password) throws TooManyFailedAttemptsException {

        String correctPassword = "CorrectPass@123";
        if(!correctPassword.equals(password)){
            failedAttempts++;
            if(failedAttempts >= 3){
                throw new TooManyFailedAttemptsException("Account is locked due to multiple failed attempts. Please try after 24 hrs.");

            }
            System.out.println("Invalid Password attempt: " + failedAttempts);
        }else {
            System.out.println("Login Successful");
        }

    }

    public static void main(String[] args) {

        System.out.println("Please enter the password to login");

        try {
            login("WrongPass@123");
            login("WrongPass@123");
            login("WrongPass@123");
        } catch (TooManyFailedAttemptsException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
