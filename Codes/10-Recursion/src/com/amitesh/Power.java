package com.amitesh;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
    public static int power(int a, int n){
        if(n == 1){
            return a;
        }

        int temp = power(a,n-1);

        return a*temp;
    }
}
