package com.roopa.learning.core.oops.inheritance;

public class Animal {

    String species;

    public void makesSound(){
        System.out.println(" All Animals make a unique sound ");
    }

    public  void dancing(){
        System.out.println("Default behaviour of Animals");
    }
}

class  Dog extends  Animal{

    @Override
    //Method Overriding of Animal Class
    public void makesSound(){
        System.out.println(" Dogs will be barking");
    }

    @Override
    public void dancing() {
        System.out.println(" Dog is dancing");
    }
}
class Cat extends Animal{
    @Override
    public void makesSound() {
        System.out.println(" Cats make a meeow sound");
    }
}
class Lion extends Animal {
    @Override
    public void makesSound() {
        System.out.println(" Lions are Roaring");
    }
}
class  Crocodile extends Animal{
    @Override
    public void dancing() {
        System.out.println(" Crocodile is dancing");
    }
}

class Runner{
    public static void main(String[] args) {

        Animal tommy = new Dog();
        Animal kitty = new Cat();
        Animal mufasa = new Lion();
        Animal croc = new Crocodile();

        /* here we are creating instances of diffrent animals and if we call them they will
        implement methods of subclass only because superclass method is overridden by
        subclass.
        In crocodile subclass we didnot override "makesSound method" ,that is the reason it is
        implementing superclass method behaviour.
         */


        tommy.makesSound();
        tommy.dancing();
        kitty.makesSound();
        mufasa.makesSound();
        croc.makesSound();
        croc.dancing();
    }
}

/* In Java all classes are subclasses or childclasses of a "Object Class".
Object Class is the parent class for all the classes in Java.
 */