package com.roopa.learning.core.oops.exceptions;

import java.util.List;

// Example for Exception handling- NullPointerException
// NullPointerException is a runtime exception that occurs when we try to access an object that is not initialized.
// In the below example, we have a Student class with name, age, and address as instance variables.
// We have created 3 Student objects and stored them in a list.
// We are trying to display the student details using the display() method.
// In the second student object, we have not initialized the address variable.
// When we try to display the student details, we get a NullPointerException.
// When exception is occurred at second student object,
// the program stops execution and the remaining student details are not displayed.


class Student {
    private String name;
    private int age;
    private String address;

    //Zero-argument constructor
    public Student(){

    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.println("Name: " + name + " ,Age: " + age + " ,Address: " + address.toUpperCase());

    }


}
public class ExceptionExamples
{
    public static void main(String[] args) {
        Student student1 = new Student("John", 25, "New York");
        Student student2 = new Student("Tom", 35, null);
        Student student3 = new Student("Jason", 55, "Chicago");
        List<Student> students = List.of(student1, student2, student3);


        for(Student student: students){
            try {
                student.display();
            } catch (NullPointerException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }

        }
    }
}
