package com.amitesh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0 ;
        for (int i = 1; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("the nth term will be "+ c);
    }
}
