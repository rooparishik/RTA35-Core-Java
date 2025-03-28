package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTraversal {

    public static void main(String[] args) {

        List<String> techs = new ArrayList<>();

        techs.add("Java");
        techs.add("Python");
        techs.add("JavaScript");
        techs.add("React");

        // Traditional way of Traversing the list using for loop
        System.out.println("Using Traditional For Loop:");
        for (int i = 0; i < techs.size(); i++) {
             System.out.print(techs.get(i)  +  ",");
        }
        System.out.println("\n");

        // Enhanced for loop

        System.out.println("Using Enhanced For Loop:");
        for (String tech : techs) {

            System.out.print(tech + ",");
        }
        System.out.println("\n");

        // Using Iterator
        System.out.println("Regular Iterator can traverse in forward direction only..");
        Iterator<String> techIterator = techs.iterator();
        while (techIterator.hasNext()) {
            System.out.print(techIterator.next() + ",");
        }
        System.out.println("\n");

        // Using ListIterator

        ListIterator<String> techListIterator = techs.listIterator();
        System.out.println("List Iterator can traverse in both forward and backward direction..");
        System.out.println("Forward Direction Traversal: ");
        while (techListIterator.hasNext()) {
            System.out.print(techListIterator.next() + ",");
        }
        System.out.println("\n");

        System.out.println("Backward Direction Traversal:");
        while (techListIterator.hasPrevious()) {
            System.out.print(techListIterator.previous() + ",");
        }
        System.out.println("\n");

        // Using forEach method (Java 8 feature)
        System.out.println("Using forEach method in List Interface :");
        techs.forEach(tech -> System.out.print(tech + ","));

        // stream API (Java 8 feature)
        System.out.println("\nUsing Stream API in List Interface:");
        techs.stream().forEach(tech -> System.out.print(tech + ","));

    }
}
