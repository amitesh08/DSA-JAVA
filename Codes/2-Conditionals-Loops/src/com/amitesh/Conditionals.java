package com.amitesh;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        System.out.println("Hey there!");
        Scanner input = new Scanner(System.in);
        System.out.println("what is your current salary: ");
        int salary = input.nextInt();
        if (salary > 10000){
            System.out.println("salary is "+ salary);
        }
        else {
            System.out.println("your salary is less than 10k");
        }
    }
}