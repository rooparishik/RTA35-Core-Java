package com.roopa.learning.core.operators;

import java.util.Arrays;
import java.util.List;

public class InstanceofOperator {

    public static void main(String[] args) {

        // InstanceOf operator cannot be used on Primitive data Types

        Integer data = 10;
        String name = "Roopa";
        if (data instanceof Integer) {

            System.out.println("data is of type integer");
        }
        if (name instanceof String){
            System.out.println("name is of type String");
        }


        Person person1 = new Employee();
        Person person2 = new Student();
        Person person3 = new Scientist();
        Person person4 = new Student();
        Person person5 = new Employee();


        List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5);

        for (Person person : personList){
            if (person instanceof Student){
                System.out.println("Apply the Scheme");
            }
        }



        if (person2 instanceof Student){
            System.out.println("Apply the Scheme");
        }

    }
}


class  Person{}

class Student extends Person{}

class Employee extends Person{}
class Scientist extends Person{}
