package com.amitesh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println("a = "+a+" b = "+b+ " c = "+c);

        //Q. Find the largest number

        if (a>b){
            if (a>c) System.out.println(a + " is greater amongst three");
        }
        else if (b>c) System.out.println(b + " is greater amongst three");
        else System.out.println(c + " is greater amongst three");
    }
}
