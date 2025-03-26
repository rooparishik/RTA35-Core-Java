package com.roopa.learning.core.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        // Searching for an element in the list
        // check if the list contains the element "Hyderabad" by using the contains() method
        System.out.println("Is Hyderabad present in the list: " + cities.contains("Hyderabad"));

        // check if the list contains the element "Kolkata" by using the contains() method
        System.out.println("Is Kolkata present in the list: " + cities.contains("Kolkata"));

        // check if the list contains the element "Mumbai" by using the indexOf() method
        System.out.println("Index of Mumbai in the list: " + cities.indexOf("Mumbai"));

        //Check if list is empty or not
        System.out.println("Is the list empty: "+ cities.isEmpty());
    }
}
