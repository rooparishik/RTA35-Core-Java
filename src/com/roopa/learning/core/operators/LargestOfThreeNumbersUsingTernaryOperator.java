package com.roopa.learning.core.operators;

public class LargestOfThreeNumbersUsingTernaryOperator {

    public static void main(String[] args) {

        int x = 50, y = 5, z = 30;

        int largestOfThree = x > y ? x > z ? x : z : y > z ? y : z ;
        System.out.println(largestOfThree);
    }
}
