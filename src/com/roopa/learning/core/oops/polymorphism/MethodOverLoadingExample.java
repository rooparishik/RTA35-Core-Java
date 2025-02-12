package com.roopa.learning.core.oops.polymorphism;

 class Caluculator {

    public int add (int a , int b){
        return a + b;
    }
    public int add (int a , int b, int c){
        return a + b + c;
    }
    public double add (double a , double b){
        return a + b;
    }
}
public class MethodOverLoadingExample{

    public static void main(String[] args) {
        Caluculator caluculator = new Caluculator();
        System.out.println(caluculator.add(4,5));
        System.out.println(caluculator.add(77.44,55.55));
        System.out.println(caluculator.add(4,8,9));
        //caluculator.add(4,5);
       // caluculator.add(4.7,5.5);
        //caluculator.add(4,8,9);


    }
}
/* This process is called Method Overloading or " Compile time Polymorhism".
Here 2 or more methods of same class can have same name but with differnt no of parameters,
then Jvm/compiler will invoke method according to the parameters given at the time of compilation.
So it is called Compile time Polymorphism.

In the above example "method add()" has been declared differently 3 times with differnt amount of parameters
and in all the 3 declarations it has same method name and belong to same class "Caluculator".
so , during compile time Jvm will decide which method to pick in accordance
 with the parameters or arguments passed.
 */