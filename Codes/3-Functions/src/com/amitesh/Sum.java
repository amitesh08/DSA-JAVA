package com.amitesh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Sum Functions ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = in.nextInt();

        int ans = sum(num1, num2);
        System.out.println("the sum of "+num1+" & "+num2+" is " +ans);

        String name = "Amitesh Gupta";
        String greet = greeting(name);
        System.out.println(greet);
    }

    static String greeting(String name) {
        return "hello " + name;
    }

    static int sum(int a, int b){
        return a + b;
    }
}
