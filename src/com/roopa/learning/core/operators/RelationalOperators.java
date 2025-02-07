package com.roopa.learning.core.operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        if (a==b){
            System.out.println(a*b);
        } else if (a>b) {
            System.out.println("a is greater than b");

        }
        if (a!=b){
            System.out.println("a is not equal to b");
            if (a<=b){
                System.out.println("a<=b");
            }
        }
    }
}
