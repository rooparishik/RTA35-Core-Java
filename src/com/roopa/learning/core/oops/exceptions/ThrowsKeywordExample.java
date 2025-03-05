package com.roopa.learning.core.oops.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Example for Exception handling- FileNotFoundException -Compile time exception
// FileNotFoundException is a checked exception that occurs when the file is not found.
// Any Class that is a subclass of Exception
// but not a subclass of RuntimeException is a checked exception or Compile time exception.
// Any class that is a subclass of RuntimeException is an unchecked exception or Runtime exception.
// In the below example, we have a FileProcessor class that reads the content of the file.
// We have a method processFile() that reads the content of the file.
// If the file is not found, then the FileNotFoundException is thrown.
// All the compile time exceptions are checked exceptions.
// All the runtime exceptions are unchecked exceptions.
// Throws keyword is used to declare an exception in the method signature.
// If a method is throwing a checked exception,
// then we need to handle it using try-catch block or throws keyword.
// If a method is throwing a runtime exception, then we can handle it or not.
// If we are not handling the runtime exception, then the program will not compile.
// If we are not handling the checked exception, then the program will not compile.
// If we are not handling the checked exception using try-catch block,
// then we need to declare the exception using the throws keyword.


public class ThrowsKeywordExample {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
     public static void readFile () throws IOException {
         FileReader fileReader = new FileReader("file.txt");
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = bufferedReader.readLine();
         bufferedReader.close();

    }
}
