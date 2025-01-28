package com.roopa.learning.core.basics;

public class HelloWorld {
 public static void main(String[] args) {
        int counter = 10;
        counter++;
        method1(counter);
    }
    public static void method1(int counter){
        System.out.println("Hello world!");
        counter++;
        System.out.println("counter value in method 1:: "+ counter);
        method2(counter);
    }
    public static void method2(int counter){
        System.out.println("Method 2");
        counter++;
        System.out.println("counter value in method 2:: "+ counter);
    }
}


