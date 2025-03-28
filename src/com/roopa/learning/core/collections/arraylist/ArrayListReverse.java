package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println("Fruits List: " + fruits);

        Collections.reverse(fruits); // here Collections refers to utility class in java.util package
        System.out.println("Fruits List after reversing: " + fruits);

    }
}
// Collections class provides a utility method reverse() to reverse the elements of a List.
// Collections class is different from Collection interface. Collection interface is the root interface of the Java Collections Framework.
// Collection interface is a member of the java.util package.L