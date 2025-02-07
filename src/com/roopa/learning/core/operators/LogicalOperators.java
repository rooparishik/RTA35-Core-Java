package com.roopa.learning.core.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // && || !

        int a = 10 , b = 50;

        System.out.println("Logical And :: " + (a > 10 && b > 10));
        System.out.println("Logical Or :: " + (a > 10 || b > 10));
        System.out.println("Logical Not :: " + !( b > a));
        }
}
