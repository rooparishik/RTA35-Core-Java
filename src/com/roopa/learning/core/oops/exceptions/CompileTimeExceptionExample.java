package com.roopa.learning.core.oops.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Example for Exception handling- FileNotFoundException -Compile time exception
// FileNotFoundException is a checked exception that occurs when the file is not found.
// In the below example, we have a FileProcessor class that reads the content of the file.
// We have a method processFile() that reads the content of the file.
// If the file is not found, then the FileNotFoundException is thrown.
// We are catching the exception and printing the message.
// If the file is found, then the file is processed successfully.
// If the file is not found, then the program stops execution and the remaining code is not executed.
// FileNotFoundException is a checked exception, so we need to handle it using try-catch block or throws keyword.
// If we don't handle the checked exception, then the program will not compile.
// In the below example, the file secret.txt is not found, so the FileNotFoundException is thrown.
// The program stops execution and the remaining code is not executed.



class FileProcessor {
       private static String fileName = "secret.txt";


       public void processFile() {
           System.out.println("Processing the file...");
           try {
               BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
           } catch (FileNotFoundException e) {
               System.out.println("File not found: " + e.getMessage());
               throw new RuntimeException(e);// throws runtime exception to JVM
           }
           // When we don't know which exception will occur, we can use Exception class
           // This will catch all the exceptions
           catch (Exception e) {
               System.out.println("Exception occurred: " + e.getMessage());
           }
           System.out.println("File processed successfully");
    }
}
public class CompileTimeExceptionExample {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile();
    }
}
