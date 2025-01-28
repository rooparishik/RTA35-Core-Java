package com.roopa.learning.core.Operators;



public class BitWiseOperators {

    public static void main(String[] args) {

        int num1 = 5; //Binary representation of 5 is 0000 0101
        int num2 = 3; //Binary representation of 3 is 0000 0011

        //-----------------------------------------------------
        //BitWise AND of 5 & 3 is 1                   0000 0001
        //BitWise OR  of 5 | 3 is 7                   0000 0111
        //BitWise NOT of ~num1 (~5) is -6             1111 1010
        //Bitwise XOR of 5 ^ 3 is  6                  0000 0110
        System.out.println("BitWise value of num1 & num 2  is :: " + (num1&num2));
        System.out.println("BitWise value of num1 | num 2  is :: " + (num1|num2));
        System.out.println("BitWise value of ~num1  is :: " + (~num1));
        System.out.println("BitWise value of num1 ^ num 2  is :: " + (num1^num2));

        int x = 45;

        System.out.println("Binary value of 45 is :: " +Integer.toBinaryString(x));

    }
}