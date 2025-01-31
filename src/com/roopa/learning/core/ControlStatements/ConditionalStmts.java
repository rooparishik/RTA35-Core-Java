package com.roopa.learning.core.ControlStatements;

public class ConditionalStmts {

    public static void main(String[] args) {
        System.out.println("Main method Started");


        ifElseStatement();
        System.out.println("Main Method Ended");
    }


    private static void ifElseStatement() {

        System.out.println("Entering ifElseStatement");
        int age = 21;
        String name = new String("Rishik");

        if (age >= 18 && name.equalsIgnoreCase("Rishik")) {
            System.out.println("Rishik, you are major now");
        } else if (age >= 22) {
            System.out.println("you are an Adult");
        } else if (!name.equalsIgnoreCase("Rishik")) {
            System.out.println("you are not Rishik");
        } else {
            System.out.println("you are minor");
        }

        System.out.println("exit from ifElseStatement");
    }
}