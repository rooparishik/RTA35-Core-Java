package com.roopa.learning.core.dailyassignments;

abstract class Car {

   abstract void startEngine();
}
class ElectricCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("Electric Tesla car Started with Battery power.");
    }
}

class PetrolCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("BMW Petrol car Started with ignition.");
    }
}

public class AbstractionCarEngineSystem {

    public static void main(String[] args) {

        Car tesla = new ElectricCar();
        tesla.startEngine();

        Car BMW = new PetrolCar();
        BMW.startEngine();

    }
}
