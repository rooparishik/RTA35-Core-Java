package com.roopa.learning.core.oops.Encapsulation;

public class EncapsulationExample1 {

    public static void main(String[] args) {

        Student roopa = new Student();
        roopa.setName("Roopa");
        roopa.setAge(38);
        roopa.setRollno(5);
        System.out.println(roopa);

        Student raj = new Student();
        raj.setName("Raj");
        raj.setAge(44);
        raj.setRollno(6);
        System.out.println(raj);

        Student rishik = new Student();
        rishik.setName("Rishik");
        rishik.setAge(12);
        rishik.setRollno(7);
        System.out.println(rishik);
    }
}

class Student{

    private String name;
    private int age;
    private int rollno;

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
           if(age < 0){
               throw new RuntimeException("Age should be positive integer");
           }
            this.age = age;
        }

    public int getRollno() {
        return rollno;
    }


    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollno=" + rollno +
                '}';
    }
}