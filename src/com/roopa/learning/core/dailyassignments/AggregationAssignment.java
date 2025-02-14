package com.roopa.learning.core.dailyassignments;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int rollNo ;

    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void displayInfo() {
        System.out.println("Student name :" +name + ", Roll No: "  +rollNo);
    }

}

class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);

    }
    public void displayStudents() {
        for(Student student : students) {
            student.displayInfo();
        }
    }

}

public class AggregationAssignment {

    public static void main(String[] args) {

        University university = new University();

        Student s1 = new Student("Roopa", 101);
        Student s2 = new Student("Raj", 102);
        Student s3 = new Student("Rishik", 103);

        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);

        System.out.println("Students in the university:");
        university.displayStudents();

        university = null;
        System.out.println("University removed but Student still exist:");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

    }
}
