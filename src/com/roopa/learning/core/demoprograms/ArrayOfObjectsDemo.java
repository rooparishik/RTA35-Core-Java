package com.roopa.learning.core.demoprograms;

class  Student{
    int rollno; //all these 3 variables are instance variables bcoz they belong to class,not method.
    String name;
    int marks;
 }

public class ArrayOfObjectsDemo {



    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Roopa";
        s1.marks = 90;


        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Raj";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Rishik";
        s3.marks = 99;

        //Creating Array of Student object

        Student student[] = new Student[3]; /* this is an array which can hold details of
                                               3 student objects */
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

     /*    for(int i = 0; i < student.length; i++){

             System.out.println(student[i].name + " : "  + student[i].marks);
         }*/

        //  Using Enhanced Forloop instead of normal Forloop

        for( Student stud : student){
            System.out.println(stud.name + " : "  + stud.marks);
        }

    }
}
