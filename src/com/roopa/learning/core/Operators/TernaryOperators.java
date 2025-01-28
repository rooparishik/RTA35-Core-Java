package com.roopa.learning.core.Operators;

public class TernaryOperators {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0){
            System.out.println("Number "  + n  +  " is even");
        } else
            System.out.println("Number "  + n  +  "  is odd");


        //Ternary operator Syntax
        // Condition ? result1 : result2;
        boolean iseven = (n % 2 == 0)? true : false;
        System.out.println(iseven);
        String isEvenorOdd = (n % 2 ==0)? " Number " + n + " is Even" : "Number" + n + " is Odd";
        System.out.println(isEvenorOdd);

    }
}
