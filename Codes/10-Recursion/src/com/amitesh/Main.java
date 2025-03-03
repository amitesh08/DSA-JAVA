package com.amitesh;

public class Main {
    public static void main(String[] args) {
        //write a function that prints 1,2,3,4,5
        numbers(1);
    }
    public static void numbers(int n ){

        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n + 1);
    }
}