package com.roopa.learning.core.collections.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAdvantages {

    public static void main(String[] args) {
        // ArrayList is a part of the Java Collection Framework.
        // It is a class that provides us dynamic arrays in Java.
        // Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
        // This is a part of java.util package.
        // ArrayList is a part of Java's collection framework and implements List interface.
        // ArrayList is initialized by a size, however, the size can increase if collection grows or shrunk if objects are removed from the collection.
        // Java ArrayList allows us to randomly access the list.
        // ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
        // ArrayList in Java can be seen as a vector in C++.
        // The difference between a vector and an ArrayList is that a Vector is synchronized while an ArrayList is not.
        // ArrayList is a resizable-array implementation of the List interface.
        // It implements all optional list operations and it also permits all elements, including null.
        // ArrayList is a part of Java's collection framework and implements List interface.
        // ArrayList is initialized by a size, however, the size can increase if collection grows or shrunk if objects are removed from the collection.
        // Java ArrayList allows us to randomly access the list.
        // ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
        // ArrayList in Java can be seen as a vector in C++.
        // The difference between a vector and an ArrayList is that a Vector is synchronized while an ArrayList is not.
        // ArrayList is a resizable-array implementation of the List interface.
        // It implements all optional list operations and it also permits all elements, including null.
        // ArrayList is a part of Java's collection framework and implements List interface.
        // ArrayList is initialized by a size, however, the size can increase if collection grows or shrunk if objects are removed from the collection.
        // Java ArrayList allows us to randomly access the list.
        // ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases (see this for details).
        // ArrayList in Java can be seen as a vector in C++.
        // The difference between a vector and an ArrayList is that a Vector is synchronized while
        // an ArrayList  is not.

        int arry[] = new int[5];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
        arry[3] = 4;
        arry[4] = 5;

        System.out.println("Array :: "+ Arrays.toString(arry));

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < 550; i++) {
            list.add(i);


        }
        System.out.println("List :: "+ list);

        list.remove(25);
        System.out.println("List :: "+ list);

        System.out.println(list.contains(5)); // returns true or False.
        System.out.println(list.contains(595)); // returns the index of the element.
    }
}

// Array index starts from 0.
// length of the array starts from 1 . This is because the length of the array is the number of elements in the array.
// In the above example, we have created an array of size 5 and added elements to it.
// We have also created an ArrayList and added elements to it.
