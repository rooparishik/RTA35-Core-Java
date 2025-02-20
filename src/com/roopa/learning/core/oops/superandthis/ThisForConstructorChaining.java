package com.roopa.learning.core.oops.superandthis;

/* Constructor chaining is nothing but calling another constructor from one constructor.*/

class Employee {


    private String name;
    private int salary;

    public Employee(String name, int salary) {
        // this(); // here "This" refers to Constructor Chaining within the same class.
        super(); // used for Constructor chaining b/n parent class and child class.
        this.name = name;
        this.salary = salary;
        System.out.println(" Parameterized Constructor Called");
    }

    public Employee() {
        this("default name", 2000);/*Constructor chaining,
                                               Here this keyword refers to constructor,
                                               which is already defined in the above constructor.*/
        System.out.println(" Zero Argument Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void display() {
        System.out.println(" Name: " + this.name + " , salary: " + this.salary);
    }

    public  void register(Department department){
        department.show(this);//Here "this" refers to employee object calling "register" method.
    }
}

class Department{

    private String deptName;

    public Department(String deptName){
    this.deptName = deptName;
    }


    public void show(Employee e){
        System.out.println(" Employee in department " + this.deptName + " : " + e.getName());
    }
}


public class ThisForConstructorChaining {

    public static void main(String[] args) {
     Employee employee1 = new Employee("Raj",20000);
     Employee employee2 = new Employee();
     employee1.display();
     employee2.display();

     Department department = new Department("CSE");
     employee1.register(department);


    }
}
/* here in the above prgm though we didn't specify any Arguments for employee2, " this keyword"
uses constructor chaining process with which we can provide values for Zero argument Constructor
 and can set values for Employee2.

 We can use only one " this" keyword in a constructor.
 It should be specified in the first line of the Constructor
 The constructor chaining in the above prgm is happening within the same Class.*/

/* If we want to do Constructor chaining, between two different classes like
parent and child classes then we use "Super" keyword to achieve it.
 */