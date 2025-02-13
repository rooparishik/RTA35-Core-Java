package com.roopa.learning.core.oops.classes;

public class Car {

    // Attributes

   private String brand; // Not accessible outside this class
   private int speed; //same as above


    // Instantiating Object through Constructor
    // Constructors are special methods used to instantiate object.

    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }


    // Methods or Behaviour

   public void accelerate(int increase){
        speed += increase;
        System.out.println(this.brand + " accelerated to " +this.speed + "km /hr");
    }

    public void  brake(int decrease){
        speed -= decrease;
        System.out.println(this.brand + " slowed down to " +this.speed + "km/hr");
    }

}

class  Benz extends Car{

    public Benz(String brand , int speed) {

        super(brand, speed); // will call parent/Super class Constructor,Super is the keyword used
    }
}

class Main{

    public static void main(String[] args) {

        // Creating object of the Car

        Car BMW = new Car("BMW" , 20);
        Car Benz = new Car("Benz" , 80);

        // Using the Objects
        // Calling the Behaviour of object

        // Invoking the object by calling it with method name
        // ObjN ame.methodName

        BMW.accelerate(60);
        Benz.brake(30);

        Benz benz1 = new Benz("BenzX5",120);
        benz1.accelerate(20);
        benz1.brake(40);


    }
}

// Setters are used to set the value for the objects which are already created.
/* There are different types of Access modifiers:

   Public Modifier:
   using this modifier visibility is available within the same class or
   outside the class,in child classes,and other classes as well. NOt only they are available
   within the same package,they are also available outside the package.

   Private Modifier:
   Private members are private to the class. we cannot access the private
   members outside the class, or in child classes.

   Protected Modifier:
   Protected members are used for reusability or for Inheritance purpose.
   Child classes can Inherit Protected members, protected fields or Protected Behaviour.
 */