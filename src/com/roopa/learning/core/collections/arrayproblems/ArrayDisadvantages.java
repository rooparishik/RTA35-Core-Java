package com.roopa.learning.core.collections.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDisadvantages {

    public static void main(String[] args) {

        int array[] = new int[5];

        // Array index starts from 0. So, the last index of the array is 4.
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Array :: "+ Arrays.toString(array));
        // In this case we did not initialize the array index 3 and 4. So, it will print 0.
       // array[7] = 4;
        // This will throw ArrayIndexOutOfBoundsException,
        // because array size is fixed for 5 elements.

        array = new int[10];

        // This will create a new array of size 10 and assign it to the array reference.
        // So, the previous array of size 5 will be lost.
        System.out.println("Array :: "+ Arrays.toString(array));


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("List :: "+ list);

        for(int i=0; i < 55; i++) {
            list.add(i);
        }

        System.out.println("List :: "+ list);
    }






}

// Disadvantages of Array:
// 1. Array size is fixed. Once we define the size of an array, we cannot change it.
// 2. It is not Dynamic. We cannot increase or decrease the size of an array at runtime.
// 3. Here if we do not define an element in array,
// it will allocate memory to that element and initialize it with default value.
// 4.To overcome these disadvantages, we can use ArrayList in Java. ArrayList is a dynamic array.