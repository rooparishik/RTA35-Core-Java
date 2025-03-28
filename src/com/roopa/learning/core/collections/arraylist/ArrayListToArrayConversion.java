package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConversion {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // Convert ArrayList to Array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("Fruits Array: "+ Arrays.toString(fruitsArray));
    }
}
