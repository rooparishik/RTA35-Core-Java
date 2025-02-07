package com.roopa.learning.core.demoprograms;

public class TernaryOp {

    public static void main(String[] args) {

        int n = 7;
        int result = 0;
        result = (n % 2 == 0) && n > 4 ? 10 : 20;
        System.out.println(result);
    }
}
