package com.roopa.learning.core.statickeyword;

class Employee {

    private String name;
    private  int age;
    private long id;

    public Employee(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void display(){
        System.out.println("===================================");
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name + " Age: " + this.age + " ID: " + this.id);
    }

    // Static Nested Class behaves like a normal class but it is declared inside another class.
    // Static Nested Class can access only static members of the outer class.
    // Static methods can access only static members of the class - same applies to static nested class
    // Static Nested Class can be accessed using the outer class name.
    // We have private,public,protected and default access specifiers for Static Nested Class like we used to have for Static Variables.


    public static class Department{
        private String departmentName;
        private   String location;
        private long departmentId;

        public Department(String departmentName, String location, long departmentId) {
            this.departmentName = departmentName;
            this.location = location;
            this.departmentId = departmentId;
        }

        public void display(){
            System.out.println("===================================");
            System.out.println("Department Details:");
            System.out.println("Department Name: " + this.departmentName + " Location: " + this.location + " Department ID: " + this.departmentId);
        }


    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Roopa", 25, 123456);
        employee.display();

        // Accessing Static Nested Class:
        // Static Nested Class can be accessed using outer class name,
        // and we can create an object of the static nested class as shown below.
        // outerclassname.staticnestedclassname objectname = new outerclassname.staticnestedclassname();
        // We can access the static nested class methods using the object of the static nested class.
        // staticnestedclassObject.staticNestedClassmethodname();

        Employee.Department department = new Employee.Department("IT", "Atlanta", 123);
        department.display();
    }
}
