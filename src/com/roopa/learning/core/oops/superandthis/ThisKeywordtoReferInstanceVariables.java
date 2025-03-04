package com.roopa.learning.core.oops.superandthis;

/* "This" keyword is used to resolve the ambiguity;
 "This keyword " is used to access instance variables within that class.
 "This keyword" cannot be used in the Static method because,Static methods belong
 to the Class,and these static methods will be loaded at the very early stages
 while loading Class, during which Objects are not created yet .*/

class Student{

    private String name;
    private  int age;

    public Student(String name,int age){
        this.name = name;   //Here this refers to instance Variable
        this.age = age;

    }

    public void displayInfo(){
        System.out.println(" Name :" + this.name + " age: " + this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


}

public class ThisKeywordtoReferInstanceVariables {

    public static void main(String[] args) {

        Student student1 = new Student("Roopa",25);
        student1.displayInfo();
        student1.setName("Bussa");
        student1.setAge(35);
        student1.displayInfo();
    }
}
