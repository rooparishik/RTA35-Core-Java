package com.roopa.learning.core.oops.superandthis;

/* Super is the keyword used to access Parent class methods and variables from Current Class.
It can also invoke parent class Constructors.
 */

class Person{
    public String name = "Bussa";

    public void display(){
        System.out.println("Parent Name : " + this.name);
        /* here we are referring to current class variable, that is why we are using
        this keyword.
         */
    }
}

class Customer extends  Person{
    public String name = "Roopa";

    public void display(){
        System.out.println("Parent Name : " + super.name);
        System.out.println("child name : " + this.name);
    }
}


/* In the above program
super keyword will access parent class variables and retrieve parent name "Bussa" ,whereas
this keyword will access current class  variables and retrieve child name "Roopa".
 */

public class SuperkeywordAccessingParentClassVariables {

    public static void main(String[] args) {

        Customer cust = new Customer();
        cust.display();

        Person p = new Person();
        p.display();


    }
}
