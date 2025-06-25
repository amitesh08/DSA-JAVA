package com.amitesh;

public class Main {
    public static void main(String[] args) {
        //storing roll numbers
        int[] rollNo = new int[5];

        //storing names
        String[] name = new String[5];

        //create the object from class student
        Student student1;      //just declaring, right now its value is null
        student1 = new Student();    //dynamically allocates the memory at run time & return reference to it.


        student1.name = "amitesh";  //this is a repeated task we can do it in more optimised way
        student1.rollNo = 8;
        student1.marks = 85.5F;

        //Student()  - this is a constructor which is special function in a class(it is by default)

        Student student2 = new Student(2,"name2",90.2f);



    }
}
//create a class
//for every single student
class Student{
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks){    //Constructor

    }
}
