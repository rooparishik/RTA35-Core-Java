package com.roopa.learning.core.oops.superandthis;

class Vehicle{

    public String name;

    public Vehicle(String name){
        this.name = name;
        System.out.println("Parent Constructor Called");

    }

}

class Car extends Vehicle{

    public String brandName;
    public String model;

    public Car(String brandName,String model){
        super(brandName);            /*calling Parent class Parameterized constructor
                                      This will let inheritance Happen,and
                                      this process is referred to as
                                      constructor chaining.*/
        this.brandName = brandName;
        this.model = model;


    }

    public  void display(){
        System.out.println("Vehicle name : " + super.name);// this stmt and below stmt gives same output.
        System.out.println("Car Name : " + this.name);//because we are invoking parent class constructor, by using super keyword.
        System.out.println("Car Details :: Brand : " + this.brandName + " , Model : " + this.model);
    }



}


public class SuperKeywordForCallingSuperClassConstructors {

    public static void main(String[] args) {

        Car myCar = new Car("HyundaiPalisade","2022");
        myCar.display();


    }
}
/* we cannot use "Super and this" keywords in a constructor at same time,
super() and this() must be the first statement in a constructor

super() is used to call the constructor of the parent class.
this() is used to call another constructor of the same class.

Java enforces only one constructor call as the first statement

When a constructor is invoked, Java must initialize either
the current object through another constructor (this()) or its parent class (super()).
Since both super() and this() must be the first statement, using both together
would cause a conflict.

 If both are required, use constructor chaining ,
 so that this() eventually leads to a constructor that calls super().
 */