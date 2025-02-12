package com.roopa.learning.core.oops.inheritance;

//  Parent Class/Super/Base Class (Level 1)

 class Vehicle {

    public  void drive(){
        System.out.println("Vehicle is moving");
    }
}

//Intermediate Class or SubClass/Derived/Child Class (Level 2)

class  Car extends  Vehicle {

    void music() {
        System.out.println("Music is playing in car");
    }
}

//  Child Class (Level 3)

class  ElectricCar extends  Car{
    void charging(){
        System.out.println("Electric Car is charging");
    }
}

public  class MultilevelInheritance{

    public static void main(String[] args) {

        Vehicle electricCar = new ElectricCar();
        electricCar.drive();
        if(electricCar instanceof ElectricCar) {

            ((ElectricCar) electricCar).charging(); // This way of Approach is called Casting
            ((ElectricCar) electricCar).music();
        }

    }
}

/*  Here we are doing Casting bcoz we created Object Refernce with Parent class variable.
So it can access only methods of parent class but not car and electriccar class.
so to access methods in those classes, we need to do Casting.
 */
/*  Java Supports Multi level Inheritance but dosent support " Multiple InHeritance "
bcoz of ambiguity problem.
It means a parent class can have n number of child classes derived from it, but a Child class
cannot extend 2  parent classes at same point of time,bcoz of ambiguity pblm.
Ambiguity means Jvm/compiler will not understand which methods to pick during compilation,if a
child class is extends from 2  or more Parent Classes.
This problem is referred as "Diamond problem" in Java.
 */