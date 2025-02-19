package com.roopa.learning.core.oops.constructors;

/* Copy Constructor is available in some other languages like javascript and others
But in Java Copy Constructor is not available by default ,provided by JVM or compiler.
Programmer have to manually define them.

This Constructor is used to copy the another Object
 */

class Aeroplane {

    private String brand;
    private  int enginesCount;
    private  String type;

// parameterized Constructor
    public Aeroplane(String brand,int enginesCount,String type){
        this.brand = brand;
        this.enginesCount = enginesCount;
        this.type = type;

    }
    // Copy Constructor
    /*Here we are Creating a new Object with the help of an Already existing Object
     In this Case a new Object " Aeroplane " is created
     with an already existing object "Aeroplane"
     This Constructor is used mainly for Cloning an  already existing Object.*/
    public Aeroplane(Aeroplane aeroplane){
        this.brand = aeroplane.brand;
        this.enginesCount = aeroplane.enginesCount;
        this.type = aeroplane.type;
    }

    public void display(){
        System.out.println("Brand : " + this.brand + " EnginesCount : " + this.enginesCount + " Type : " + this.type);
    }
}


public class CopyConstructorExample {

    public static void main(String[] args) {

        Aeroplane gulfStream = new Aeroplane("Boeing",2,"Private Jet");
        Aeroplane indigo =new Aeroplane(gulfStream);

        gulfStream.display();
        indigo.display();

    }
}
