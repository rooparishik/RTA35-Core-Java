package com.roopa.learning.core.statickeyword;



class DatabaseConnector {
    private static String connectionURL;

    // Static block
    // Static blocks are executed when the class is loaded into the memory.
    // Static blocks are used to initialize static variables.
    // Static blocks are executed only once.
    // Static blocks are executed before the main method.

    static {
        connectionURL = "jdbc:mysql://localhost:3306/learning";
        System.out.println("Static block executed");
    }

    // Below is the instance block of code
    // Instance blocks are executed when the object is created.
    // Instance blocks are used to initialize instance variables.
    // Instance blocks are executed every time when the object is created.
    // For example if 2 objects are created then instance block will be executed 2 times

    {
        System.out.println("Instance block executed");
    }

    public static void connect() {
        System.out.println("Connecting to the database...");
        System.out.println("Connected to the database using the URL: " + connectionURL);
    }

    public void display() {
        System.out.println("Displaying database connection details...");
        System.out.println("Connected to the database using the URL: " + connectionURL);
    }
}

public class StaticBlocks {

    public static void main(String[] args) {

        // Static method declaration:
        // Classname.methodname();
        DatabaseConnector.connect();
        DatabaseConnector.connect();

        DatabaseConnector db = new DatabaseConnector();
        DatabaseConnector db1 = new DatabaseConnector();
        db.display();
        db1.display();

    }
}
