package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasicOperations {

    public static void main(String[] args) {

        // Creating an ArrayList

        List<String> list = new ArrayList<>();

        // Adding elements to the ArrayList

        list.add("Java");
        list.add("React");
        list.add("Angular");
        list.add("Spring");
        list.add("Hibernate");

        //Getting the element by index

        System.out.println("Element at index 2: "+ list.get(2));

        //Updating the element by index

        list.set(3, "Spring Boot");

        try {
            list.set(5, "NodeJS");
        } catch (RuntimeException e) {
            System.out.println("RunTimeException: "+ e.getMessage());
        }

        // try to get the element at index 5 which is not present in the list
        try {
            System.out.println("Element at index 6: "+ list.get(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: "+ e.getMessage());
        }

        // Getting the size of the List

        System.out.println("Size of the List: "+ list.size());

        // Removing the element by index

        try{
            list.remove(5);
        }catch(IndexOutOfBoundsException  e) {
            System.out.println("IndexNotFoundException: "+ e.getMessage());
        }

        // Display the Final List

        System.out.println("Final List: "+ list);
    }
}
