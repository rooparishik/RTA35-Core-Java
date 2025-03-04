package com.roopa.learning.core.oops.constructors;

class Car {


    //Constructors are generally used to perform an inheritance behaviour,with which
    //parent and child classes are connected by invoking an object or by initialising an object
    //through the help of Constructors.
    //Here no constructor is defined
    //So Compiler will provide the constructor during compile time which will look like below
    //But it is not explicitly defined by Programmer.
    //Constructor name should be same as class name.
    /*Default constructor is usually zero argument Constructor,
     which means no parameters are passed during instantiation of object.*/

  //  public  Car() {}

        private String brand;
        private int speed;

        public void display(){
            System.out.println("Brand : " + brand + " speed : " + speed);
        }

}


public class DefaultConstructorsExample {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.display();

    }
}
/* When we run the prgm default values of String and integer are displayed
because we didn't pass any arguments, default constructor is invoked by Jvm
during Compilation.
Default Value of integer is " zero(0) ".
Default Value of String is " null ".
Default value of Boolean is " false ".

For all the java programs Object class is the super class, So to inherit the properties
of Object class, Jvm will provide default Constructor during Compilation.
So in the Above program to inherit properties of Object Class by Car Class, JVM provides
default Constructor.
 */