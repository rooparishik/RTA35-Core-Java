package com.roopa.learning.core.datatypes;

public class ReferencedDataTypesExample {


    public static void main(String[] args) {

        //Classes or Objects

        Person raj = new Person(  "Raj", 35);
        System.out.println("Name:: " + raj.getName());
        System.out.println("Age:: " + raj.getAge());

        //Arrays

        int [] numbers =  new int[] {1,2,3,4,5,6,7};
        int [] numbers2 = {10,20,30,40,50};

        System.out.println("Numbers Length :: " + numbers.length);
        System.out.println("First Element :: " + numbers[5]);

        //Strings

        String greetings = "HelloWorld!";
        System.out.println("Print Message :: " + greetings);
    }
}
class  Person{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}