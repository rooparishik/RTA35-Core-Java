package com.roopa.learning.core.oops.exceptions.errors;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        recursiveMethod(10);
    }
    public static void recursiveMethod(int i) {
        if (i == 0) {
            return;
        } else {
            recursiveMethod(i);
        }
    }
}
