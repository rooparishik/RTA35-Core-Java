package com.roopa.learning.core.oops.inheritance;

     class Shape {

         public void draw() {
            System.out.println("Shape is drawn");
        }
    }


class Square extends  Shape{
    @Override
    public  void draw(){
        System.out.println("Drawing a Square Shape");
    }
}

class Rectangle extends  Shape{
    @Override
    public  void draw(){
        System.out.println("Drawing a Rectangle Shape");
    }
}


 public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        shape.draw();
        square.draw();
        rectangle.draw();
    }

}

//Here we are creating a Parent Class refernce Variable and assigning a Child class object.
//THis is to achieve Polymorphism.