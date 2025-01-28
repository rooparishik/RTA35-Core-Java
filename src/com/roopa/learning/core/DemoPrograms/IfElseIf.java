package com.roopa.learning.core.DemoPrograms;

public class IfElseIf {

    public static void main(String[] args) {

        int x = 80;
        int y = 25;
        int z = 15;

        if (x > y && x > z) {
            System.out.println("x is greatest");
        }
        else if (y > z) {
            System.out.println("y is greatest");

        }
        else
            System.out.println("z is greatest");
    }
}
