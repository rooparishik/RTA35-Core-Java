package com.roopa.learning.core.oops.superandthis;

class Animal{

    public void eatingAndSleeping(){
        System.out.println("Animals are eating and Sleeping");
    }
}

class Cat extends Animal{

    @Override
    public void eatingAndSleeping() {
        super.eatingAndSleeping(); //calling parent class method using "Super keyword".
        System.out.println("Cat is eating and Sleeping for longer hours");
    }
}

public class SuperKeywordAccessingParentClassMethods {

    public static void main(String[] args) {

        Cat kitty = new Cat();
        kitty.eatingAndSleeping();

    }
}
// we cannot use keywords "Super and This " in Static area.