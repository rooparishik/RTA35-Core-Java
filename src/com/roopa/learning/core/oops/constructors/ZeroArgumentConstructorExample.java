package com.roopa.learning.core.oops.constructors;

/* Zero argument Constructor is a Constructor  explicitly provided by the programmer,
but without passing any arguments.

Default  Constructor is a Constructor provided by the compiler during  compilation,
but without passing any arguments.
 */
class Student {

    private String name;
    private int age;

//  Zero argument Constructor
    public Student (){

    }

    public void display(){
        System.out.println("name : " + name + " age: " + age);
    }

}


public class ZeroArgumentConstructorExample {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.display();
    }
}
