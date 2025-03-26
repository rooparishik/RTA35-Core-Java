package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(25);
        list.add(15);
        System.out.println("Initial List: " + list);

        // Sorting the list
        list.sort(Comparator.reverseOrder());

        // Another way to sort the list
        // Collections.sort(list,Comparator.reverseOrder());
        System.out.println("List after sorting : " + list);
    }
}
