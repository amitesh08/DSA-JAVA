package com.amitesh;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("print number 1 to 5 ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the n value: ");
        int n = input.nextInt();
        //For Loop
        for (int i = 0; i < n; i++) {
            System.out.print(i);
        }
        System.out.println();
        //while Loop
        int count = 0;
        while(count < n){
            System.out.print(count);
            count++;
        }

    }
}
