package com.roopa.learning.core.oops.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Java 7 introduced a new feature called try-with-resources.
// Try-with-resources is a feature that allows us to declare resources
// that will be closed automatically after the program is executed.
// This feature replaces the try-finally block.
// The resources are declared in the try block.
// The resources are closed automatically after the try block is executed.

public class TryWithoutResourcesExample {

    // Below is a traditional way of handling resources
    // We need to close the resources explicitly in the finally block.
    // This is Error prone as we may forget to close the resources.
    // This approach is used before Java 7.

    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("file.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (IOException e) {
            System.out.println("File not found or Error reading file");
        }finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing BufferedReader");
                }
            }
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing FileReader");
                }
            }
        }
    }
}

class TryWithResourcesExample {

    public static void main(String[] args) {

        // This is the same code as above, but using try-with-resources
        // The resources are declared in the try block.
        // The resources are closed automatically after the try block is executed.
        // In the below example, we are reading the content of the file using FileReader and BufferedReader.
        // In this example File Reader and buffered reader are closed automatically after the try block is executed.
        // In order to use try-with-resources syntax, the resource should implement the AutoCloseable interface.

        try (FileReader fileReader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (IOException e) {
            System.out.println("File not found or Error reading file");
        }
    }
}
