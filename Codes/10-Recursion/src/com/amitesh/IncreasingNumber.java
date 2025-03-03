package com.amitesh;

public class IncreasingNumber {
    public static void main(String[] args) {
        incNumber(5);
    }
    public static void incNumber(int n ){
        if (n == 1) {
            System.out.println(1);
            return;
        }

        incNumber(n-1);
        System.out.println(n);
    }
}
