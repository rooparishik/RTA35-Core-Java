package com.roopa.learning.core.dailyassignments;

class Employee{

    String name;
    int employeeId;

    public Employee(String name , int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    public  FullTimeEmployee(String name , int employeeId , double monthlySalary){
        super(name,employeeId);
        this.monthlySalary = monthlySalary;

    }
    @Override
    public double calculateSalary() {
        return  monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    public  PartTimeEmployee(String name , int employeeId , double hourlyRate , int hoursWorked){
        super(name,employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }
    @Override
    public double calculateSalary() {
        return  hourlyRate * hoursWorked;
    }
}

public class InheritanceEmployeeMngmtSystemExample {

    public static void main(String[] args) {

        Employee ftemployee = new FullTimeEmployee("Roopa", 500, 50000);
        Employee ptemployee = new PartTimeEmployee("Rishik",550,120,40);

        System.out.println("Full time Employee Salary is :" +ftemployee.calculateSalary());
        System.out.println("Part time Employee Salary is :" +ptemployee.calculateSalary());

    }
}
