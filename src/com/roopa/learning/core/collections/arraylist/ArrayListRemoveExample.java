package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Initial List: " + list);

        // Removing the element by  valid  index

        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // Removing the element by invalid index
        try {
            list.remove(9);
        } catch (RuntimeException e) {
            System.out.println("RunTimeException: " + e.getMessage());
        }

        // Removing the element by object

        list.remove(Integer.valueOf(40));
        System.out.println("List after removing element 40: " + list);

        // Removing all elements from the list

        list.clear();
        System.out.println("List after clearing all elements: " + list);
    }
}
