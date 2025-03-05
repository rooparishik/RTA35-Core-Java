package com.roopa.learning.core.oops.exceptions;

import java.sql.*;

public class DatabaseConnectionExampleForTryCatchFinally {

    public static void main(String[] args) {

        Connection conn = null;

        // Finally block is used to clean the resources like closing database connection, file, etc.
        // Finally block is always executed whether the exception is occurred or not.

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            System.out.println("Connected to the database");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee");
        } catch (SQLException e) {
            System.out.println("Exception occurred while connecting to the database" );
        } finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Exception occurred while closing the connection ");
            }
        }
    }
}
// In the above example, we are trying to connect to the database.
// We are using DriverManager.getConnection() method to connect to the database.
// DriverManager.getConnection() method throws Compiletime exception .
// So we need to handle the exception using try-catch block or throws keyword.
// If the connection is successful, then the connection object is returned.
// If the connection is not successful, then the SQLException is thrown.
// We are catching the SQLException which is checked Exception and throwing a RuntimeException.