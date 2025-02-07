package com.roopa.learning.core.operators;

public class ArithmaticOperators {

    public static void main(String[] args) {


        int n1 = 10;
        int n2 = 20;


        int sum = n1 + n2;
        int sub = n1 - n2;
        int mul = n1 * n2;

        sum += mul; //sum = sum+mul
        System.out.println(sum);
    }
}
