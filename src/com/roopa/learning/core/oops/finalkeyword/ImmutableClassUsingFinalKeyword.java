package com.roopa.learning.core.oops.finalkeyword;

// Immutable class using final keyword
// Make the class final so that it cannot be extended or subclassed
// Make the instance variables private and final so that they cannot be modified
// Provide only getter methods to access the instance variables
// Do not provide setter methods to modify the instance variables
// Do not provide any methods which can change the state of the object


final  class ImmutableClass{
    private final int id;
    private final String name;

    public ImmutableClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class ImmutableClassUsingFinalKeyword {

    public static void main(String[] args) {
    ImmutableClass immutableClass = new ImmutableClass(1,"Roopa");
    System.out.println("Id: "+immutableClass.getId());
    System.out.println("Name: "+immutableClass.getName());

    //immutableClass.id = 2; // Compilation error: Cannot assign a value to final variable 'id'

    }



}
