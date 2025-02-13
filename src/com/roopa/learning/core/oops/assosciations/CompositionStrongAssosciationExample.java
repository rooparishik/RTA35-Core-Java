package com.roopa.learning.core.oops.assosciations;

//Example of Composition

class  Engine{

    void  start(){
        System.out.println("Engine Started");
    }
}

class Car{

    Engine engine;

    public Car(Engine engine){  //object of type Engine is created
        this.engine = new Engine();
    }
    public void startCar(){ //method declaration
        this.engine.start();
        System.out.println("Car Started");
    }

}


public class CompositionStrongAssosciationExample {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
    }
}

/* Composition usually represents a Stronger Assosciation between two
Classes. Exisistence of one class usually depends on other Class. It usually
follows " Has-A " relationship between two Classes.
In the Above prgm if Class Engine is not there, then Class Car will not excist.
Since those two are highly dependant on each other ,this relationship between
them is referred as Strong " CompositionAssosciation ."
 */