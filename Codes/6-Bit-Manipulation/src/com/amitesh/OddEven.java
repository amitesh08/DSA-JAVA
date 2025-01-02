package com.amitesh;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : " );
        int n = sc.nextInt();
        isEvenOdd(n);
    }

    public static void isEvenOdd(int n ){
        //using bitwise operator is faster approach than n%2==0.
        if ((n & 1) == 0){
            System.out.println(n+" is even.");
        }
        else {
            System.out.println(n+" is odd.");
        }
    }
}
