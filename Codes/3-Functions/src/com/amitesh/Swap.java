package com.amitesh;

public class Swap {
    public static void main(String[] args) {
        //swap two numbers
        swap(32,42);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a "+a+" b "+b);
    }
}
